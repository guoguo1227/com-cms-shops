package com.cms.shop.service;

import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :商铺类型服务
 * @Date : 16-11-6
 */
public interface HotcategoryService {

    Page<Hotcategory> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);
}
