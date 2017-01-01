package com.cms.shop.service.impl;

import com.cms.shop.constants.ShopConstant;
import com.cms.shop.dao.base.mapper.*;
import com.cms.shop.enums.*;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.ShopExt;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.ShopImgService;
import com.cms.shop.service.ShopService;
import com.cms.shop.service.ShopTypeService;
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : samuel
 * @Description :商铺服务实现
 * @Date : 16-11-5
 */

@Service
public class ShopServiceImpl implements ShopService {

    private static final Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private BuildingFinishingMapper buildingFinishingMapper;

    @Autowired
    private DistrictMapper districtMapper;

    @Autowired
    private ShopImgService shopImgService;

    @Autowired
    private ShopTypeService shopTypeService;

    @Autowired
    private HotcategoryMapper hotcategoryMapper;

    @Autowired
    private InvestmentMapper investmentMapper;

    @Autowired
    private BuildingFacilityMapper buildingFacilityMapper;

    @Autowired
    private BuildingOccupancyMapper buildingOccupancyMapper;

    @Override
    public Page<ShopVo> queryListBySearchCondition(SearchCondition condition) {
        Page<ShopVo> page = null;
        List<ShopVo> shopVoList = new ArrayList<>();
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            ShopCriteria criteria = new ShopCriteria();
            ShopCriteria.Criteria cri = criteria.createCriteria();
            //锁定状态暂时没用上
            cri.andEditTagEqualTo(ShopConstant.EDIT_TAG_LOCK);
            //审核状态
            if(null != condition.getCheckStatus()){
                cri.andAuditStatusEqualTo(condition.getCheckStatus());
            }
            //商铺状态
            if(null != condition.getStatus()){
                cri.andShopStatusEqualTo(condition.getStatus());
            }

            //区域
            if(null != condition.getDistrictId()){
                cri.andDistrictIdEqualTo(condition.getDistrictId());
            }
            //商铺类型
            if(null != condition.getHotId()){
                cri.andHotIdEqualTo(condition.getHotId());
            }
            //商铺面积
            if(null != condition.getAreaId()){
                AreaRangeEnum rangeEnum = AreaRangeEnum.getEnumByKey(condition.getAreaId());
                if(null != rangeEnum){
                    if(!rangeEnum.getMinNumber().equals(BigDecimal.ZERO)){
                        cri.andSquareMetresGreaterThanOrEqualTo(rangeEnum.getMinNumber());
                    }
                    if(!rangeEnum.getMinNumber().equals(BigDecimal.ZERO)){
                        cri.andSquareMetresLessThanOrEqualTo(rangeEnum.getMaxNumber());
                    }
                }
            }
            //层数
            if(null != condition.getFloor()){
                cri.andFloorEqualTo(condition.getFloor());
            }
            //商铺名称
            if(!StringUtils.isBlank(condition.getName())){
                cri.andShopNameLike("%"+condition.getName()+"%");
            }
            //搜索
            if(!StringUtils.isBlank(condition.getSearchContent())){
                cri.andShopNameLike("%"+condition.getSearchContent()+"%");
            }
            //id
            if(null != condition.getId()){
                cri.andIdEqualTo(condition.getId());
            }
            //热门类型
            if(null != condition.getType()){
                cri.andTypeEqualTo(condition.getType());
            }
            //装修情况
            if(null != condition.getFinishingId()){
                cri.andFinishingIdEqualTo(condition.getFinishingId());
            }
            //适宜业态
            if(null != condition.getOcpyId()){
                cri.andOcpyIdEqualTo(condition.getOcpyId());
            }
            //物业性质
            if(null != condition.getTypeId()){
                cri.andTypeIdEqualTo(condition.getTypeId());
            }
            //排序
            criteria.setOrderByClause(" ID desc ");
            int count = shopMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Shop> shopList = shopMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(shopList)){
                    for(Shop shop : shopList){
                        ShopVo shopVo = new ShopVo();
                        shopVo.setShop(shop);
                        if(null != shop.getFinishingId()){
                            BuildingFinishing buildingFinishing = buildingFinishingMapper.selectByPrimaryKey(shop.getFinishingId());
                            if(null != buildingFinishing){
                                shopVo.setBuildingFinishing(buildingFinishing.getFinishingName());
                            }
                        }
                        if(null != shop.getDistrictId()){
                            District district = districtMapper.selectByPrimaryKey(shop.getDistrictId());
                            if(null != district){
                                shopVo.setDistrictStr(district.getDistrictName());
                            }
                        }
                        //配套设施
                        StringBuilder facilityStr = new StringBuilder();
                        if(!StringUtils.isBlank(shop.getFacility())){
                            String [] facilityArr = shop.getFacility().split(",");
                            if(facilityArr.length>0){
                                for(String str : facilityArr){
                                    if(!StringUtils.isBlank(str)){
                                        try {
                                            Integer facilityId = Integer.parseInt(str);
                                            BuildingFacility buildingFacility = buildingFacilityMapper.selectByPrimaryKey(facilityId);
                                            if(null != buildingFacility){
                                                if(facilityStr.length()>0){
                                                   facilityStr.append(",").append(buildingFacility.getFacilName());
                                                }else{
                                                    facilityStr.append(buildingFacility.getFacilName());
                                                }
                                            }

                                        }catch (NumberFormatException e){
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                        shopVo.setFacility(facilityStr.toString());
                        //图片
                        ShopImg img = shopImgService.getImgByShopId(shop.getId());
                        if(null != img){
                            shopVo.setFilePath(img.getNewImgName());
                        }
                        List<ShopImg> shopImgList = shopImgService.getImgListByShopId(shop.getId());
                        if(CollectionUtils.isNotEmpty(shopImgList)){
                            if(shopImgList.size()>0){
                                if(shopImgList.size()>1){
                                    shopVo.setImg2(shopImgList.get(1).getNewImgName());
                                }
                                shopVo.setImg1(shopImgList.get(0).getNewImgName());
                            }
                        }
                        if(null != shop.getOcpyId()){
                            BuildingOccupancy buildingOccupancy = buildingOccupancyMapper.selectByPrimaryKey(shop.getOcpyId());
                            if(null != buildingOccupancy){
                                shopVo.setBuildingOccupancy(buildingOccupancy.getOcpyName());
                            }
                        }
                        //保证金
                        String despositStr= "0";
                        if(null != shop.getDepositType() && !StringUtils.isBlank(shop.getPriceSe())){
                            try {
                                Integer price = Integer.parseInt(shop.getPriceSe());
                                Integer sum = shop.getDepositType()*price;
                                despositStr = ""+sum;
                            }catch (NumberFormatException e){
                                e.printStackTrace();
                            }
                        }
                        shopVo.setDeposit(despositStr);
                        shopVoList.add(shopVo);
                    }
                    page.setPageData(shopVoList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<Shop> queryList(SearchCondition condition) {
        ShopCriteria criteria = new ShopCriteria();
        ShopCriteria.Criteria cri = criteria.createCriteria();
        cri.andAuditStatusEqualTo(CheckStatusEnum.PASS.getKey()).andEditTagEqualTo(ShopConstant.EDIT_TAG_LOCK);
        criteria.setOrderByClause(" ID desc ");
        criteria.setLimitStart(0);
        criteria.setLimitEnd(3);
        if(null != condition){
            if(null != condition.getLimit()){
                criteria.setLimitEnd(condition.getLimit());
            }
            if(null != condition.getHotId()){
                cri.andHotIdEqualTo(condition.getHotId());
            }
        }
        List<Shop> shopList = shopMapper.selectByExample(criteria);
        return  shopList;
    }

    @Override
    public ShopExt queryShopDetailById(Integer id) {
        ShopExt ext =  new ShopExt();
        if(null != id){
            Shop shop = shopMapper.selectByPrimaryKey(id);
            if(null != shop){
                try {
                    BeanUtilExt.copyProperties(ext,shop);
                    List<ShopImg> imgList = shopImgService.getImgListByShopId(shop.getId());
                    if(CollectionUtils.isNotEmpty(imgList)){
                        if(imgList.size()>0){
                           if(imgList.size()>1){
                               ext.setImg2(imgList.get(1).getNewImgName());
                           }
                            ext.setImg1(imgList.get(0).getNewImgName());

                        }
                    }
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }
        return ext;
    }

    @Override
    public Page<ShopVo> queryCheckListBySearchCondition(SearchCondition condition) {
        if(null == condition){
            condition = new SearchCondition();
        }
        if(null == condition.getCheckStatus()){
            condition.setCheckStatus(CheckStatusEnum.AUDIT.getKey()); //待审核
        }
        condition.setStatus(ShopStatusEnum.WAIT.getKey());
        Page<ShopVo> page = queryListBySearchCondition(condition);

        return page;
    }

    @Override
    public List<ShopVo> getOnList(ShopTypeEnum type) {

        List<ShopVo> voList = new ArrayList<>();
        ShopCriteria criteria = new ShopCriteria();
        criteria.createCriteria().andAuditStatusEqualTo(CheckStatusEnum.PASS.getKey()).andEditTagEqualTo(ShopConstant.EDIT_TAG_LOCK)
                .andTypeEqualTo(type.getKey());
        criteria.setOrderByClause(" ID desc ");
        criteria.setLimitStart(0);
        criteria.setLimitEnd(6);
        List<Shop> shopList = shopMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(shopList)){
            for(Shop shop : shopList) {
                ShopVo vo = new ShopVo();
                vo.setShop(shop);
                //图片
                ShopImg img = shopImgService.getImgByShopId(shop.getId());
                if(null != img){
                    vo.setFilePath(img.getNewImgName());
                }
                if(null != shop.getDistrictId()){
                    District district = districtMapper.selectByPrimaryKey(shop.getDistrictId());
                    if(null != district){
                        vo.setDistrictStr(district.getDistrictName());
                    }
                }
                if(null != shop.getFinishingId()){
                    BuildingFinishing buildingFinishing = buildingFinishingMapper.selectByPrimaryKey(shop.getFinishingId());
                    if(null != buildingFinishing){
                        vo.setBuildingFinishing(buildingFinishing.getFinishingName());
                    }
                }
                if(null != shop.getTypeId()){
                    ShopType shopType = shopTypeService.queryShopTypeById(shop.getTypeId());
                    vo.setShopType(shopType.getTypeName());
                }
                //道路缩写
                if(StringUtils.isBlank(shop.getRoad())){
                   if(!StringUtils.isBlank(shop.getShopName())){
                       shop.setRoad(shop.getShopName());
                   }
                }

                voList.add(vo);
            }
        }
        return voList;
    }

    @Override
    public Shop queryShopById(Integer id) {
        Shop shop = null;
        if(null != id){
            shop = shopMapper.selectByPrimaryKey(id);
        }
        return shop;
    }

    @Override
    public RequestResult updateShopType(Integer id, Integer type) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id && null != type){
            Shop shop = shopMapper.selectByPrimaryKey(id);
            if(null != shop){
                shop.setType(type);
                int i = shopMapper.updateByPrimaryKeySelective(shop);
                if(i>0){
                    success = true;
                }
            }else{
                message = "该商铺不存在";
            }
        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult updateRoad(Integer id, String road) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id && !StringUtils.isBlank(road)){
            Shop shop = shopMapper.selectByPrimaryKey(id);
            if(null != shop){
                shop.setRoad(road);
                int i = shopMapper.updateByPrimaryKeySelective(shop);
                if(i>0){
                    success = true;
                }
            }else{
                message = "该商铺不存在";
            }
        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult checkShop(Integer id,boolean ifpass) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            Shop shop = shopMapper.selectByPrimaryKey(id);
            if(null != shop){
                if(ifpass){
                    shop.setAuditStatus(CheckStatusEnum.PASS.getKey());
                }else{
                    shop.setAuditStatus(CheckStatusEnum.NOPASS.getKey());
                }
                int i = shopMapper.updateByPrimaryKey(shop);
                if(i>0){
                    success = true;
                }

            }else{
                message = "该商铺不存在!";
            }
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult addShop(ShopExt ext) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != ext  && !StringUtils.isBlank(ext.getShopName())){
            Shop shop = new Shop();
            try {
                BeanUtilExt.copyProperties(shop,ext);
                shop.setCreateDate(new Date());
                shop.setAuditStatus(CheckStatusEnum.AUDIT.getKey());
                shop.setEditTag(ShopConstant.EDIT_TAG_LOCK);
                shop.setType(ShopTypeEnum.COMMON.getKey());
                //todo,测试
                shop.setShopStatus(OnlineStatusEnum.ONLINE.getKey());
                int i = shopMapper.insertSelective(shop);
                if(i>0){
                    ShopImg img = new ShopImg();
                    if(!StringUtils.isBlank(ext.getImg1())){
                        img.setShopId(shop.getId());
                        img.setNewImgName(ext.getImg1());
                        shopImgService.addShopImg(img);
                    }
                    if(!StringUtils.isBlank(ext.getImg2())){
                        img.setShopId(shop.getId());
                        img.setNewImgName(ext.getImg2());
                        shopImgService.addShopImg(img);
                    }
                    success = true;
                }
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }else{
            message = "商铺名称不能为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult updateShop(Shop shop) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != shop && null != shop.getId()){
            int i = shopMapper.updateByPrimaryKeySelective(shop);
            if(i>0){
                success = true;
            }else{
                message = "操作失败!";
            }
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public Investment queryInvestment() {
        Investment investment = null;
        InvestmentCriteria criteria = new InvestmentCriteria();
        criteria.setOrderByClause(" id desc ");
        List<Investment> list = investmentMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(list)){
            investment = list.get(0);
        }
        return investment;
    }

    @Override
    public RequestResult updateInvestment(Investment investment) {

        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != investment && null != investment.getId()){
            Investment invest = investmentMapper.selectByPrimaryKey(investment.getId());
            if(null != invest){
                invest.setDescription(investment.getDescription());
                int i = investmentMapper.updateByPrimaryKeySelective(invest);
                if(i>0){
                    success = true;
                }

            }else{
                message = "该招商热线不存在!";
            }
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }
}
