package com.cms.shop.service;

import com.cms.shop.dao.base.mapper.BuildingFinishingMapper;
import com.cms.shop.dao.base.mapper.DistrictMapper;
import com.cms.shop.dao.base.mapper.ShopMapper;
import com.cms.shop.model.base.BuildingFinishing;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.ShopCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.service.impl.ShopService;
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : samuel
 * @Description :商铺服务实现
 * @Date : 16-11-5
 */

@Service
public class ShopServiceImpl implements ShopService{

    private static final Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private BuildingFinishingMapper buildingFinishingMapper;

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public Page<ShopVo> queryListBySearchCondition(SearchCondition condition) {
        Page<ShopVo> page = null;
        List<ShopVo> shopVoList = new ArrayList<>();
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            ShopCriteria criteria = new ShopCriteria();
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
                        shopVoList.add(shopVo);
                    }
                    page.setPageData(shopVoList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }
}
