package com.cms.shop.service;

import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.HotcategoryVo;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :商铺类型服务
 * @Date : 16-11-6
 */
public interface HotcategoryService {

    Page<Hotcategory> queryPageByCondition(SearchCondition condition);

    List<Hotcategory> queryAll();

    List<HotcategoryVo> queryHotNac();

    boolean deleteById(Integer id);

    boolean addHotcate(Hotcategory hotcategory);

    boolean updateHotcat(Hotcategory hotcategory);
}
