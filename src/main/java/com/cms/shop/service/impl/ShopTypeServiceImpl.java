package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.ShopTypeMapper;
import com.cms.shop.model.base.BuildingOccupancy;
import com.cms.shop.model.base.BuildingOccupancyCriteria;
import com.cms.shop.model.base.ShopType;
import com.cms.shop.model.base.ShopTypeCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.ShopTypeService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-6
 */
@Service
public class ShopTypeServiceImpl implements ShopTypeService{

    @Autowired
    private ShopTypeMapper shopTypeMapper;

    @Override
    public Page<ShopType> queryPageByCondition(SearchCondition condition) {
        Page<ShopType> page = null;
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            ShopTypeCriteria criteria = new ShopTypeCriteria();
            //排序
            int count = shopTypeMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<ShopType> shopTypeList = shopTypeMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(shopTypeList)){
                    page.setPageData(shopTypeList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = shopTypeMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public ShopType queryShopTypeById(Integer id) {
        ShopType shopType = null;
        if(null != id){
            shopType = shopTypeMapper.selectByPrimaryKey(id);
        }
        return shopType;
    }

    @Override
    public List<ShopType> queryAll() {
        ShopTypeCriteria criteria = new ShopTypeCriteria();
        return shopTypeMapper.selectByExample(criteria);
    }
}
