package com.cms.shop.service.impl;

import com.cms.shop.constants.ShopConstant;
import com.cms.shop.dao.base.mapper.*;
import com.cms.shop.enums.*;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.HotcategoryService;
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
                .andShopStatusEqualTo(OnlineStatusEnum.ONLINE.getKey()).andTypeEqualTo(type.getKey());
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
}
