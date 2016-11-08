package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.HotcategoryMapper;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.DistrictCriteria;
import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.base.HotcategoryCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.HotcategoryService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Page<Hotcategory> queryPageByCondition(SearchCondition condition) {
        Page<Hotcategory> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            HotcategoryCriteria criteria = new HotcategoryCriteria();
            int count = hotcategoryMapper.countByExample(criteria);
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
        List<Hotcategory> hotcategoryList= hotcategoryMapper.selectByExample(criteria);
        return hotcategoryList;
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
}
