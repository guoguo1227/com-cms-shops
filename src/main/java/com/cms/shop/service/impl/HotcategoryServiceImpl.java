package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.HotcategoryMapper;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.HotcategoryVo;
import com.cms.shop.service.HotcategoryService;
import com.cms.shop.service.ShopService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : samuel
 * @Description : 商铺类型服务
 * @Date : 16-11-6
 */
@Service
public class HotcategoryServiceImpl implements HotcategoryService{

    @Autowired
    private HotcategoryMapper hotcategoryMapper;

    @Autowired
    private ShopService shopService;

    @Override
    public Page<Hotcategory> queryPageByCondition(SearchCondition condition) {
        Page<Hotcategory> page = null;
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            HotcategoryCriteria criteria = new HotcategoryCriteria();
            int count = hotcategoryMapper.countByExample(criteria);
            criteria.setOrderByClause(" hot_Id desc ");
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Hotcategory> hotcategoryList= hotcategoryMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(hotcategoryList)){
                    page.setPageData(hotcategoryList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<Hotcategory> queryAll() {
        HotcategoryCriteria criteria = new HotcategoryCriteria();
        criteria.setOrderByClause(" priority desc ");
        List<Hotcategory> hotcategoryList= hotcategoryMapper.selectByExample(criteria);
        return hotcategoryList;
    }

    @Override
    public List<HotcategoryVo> queryHotNac() {
        SearchCondition condition = new SearchCondition();
        condition.setLimit(3);

        List<HotcategoryVo> voList = new ArrayList<>();
        HotcategoryCriteria criteria = new HotcategoryCriteria();
        criteria.setOrderByClause(" priority desc ");
        criteria.setLimitStart(0);
        criteria.setLimitEnd(6);
        List<Hotcategory> hotcategoryList= hotcategoryMapper.selectByExample(criteria);
        if(CollectionUtils.isNotEmpty(hotcategoryList)){
            for(Hotcategory hot : hotcategoryList){
                HotcategoryVo vo = new HotcategoryVo();
                vo.setHotcategory(hot);

                condition.setHotId(hot.getHotId());
                List<Shop> shopList = shopService.queryList(condition);
                vo.setShopList(shopList);
                voList.add(vo);
            }
        }
        return voList;
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = hotcategoryMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean addHotcate(Hotcategory hotcategory) {
        boolean success = true;
        if(null != hotcategory){
            int i = hotcategoryMapper.insertSelective(hotcategory);
            if(i>0){
                success = true;
            }
        }
        return success;
    }
}
