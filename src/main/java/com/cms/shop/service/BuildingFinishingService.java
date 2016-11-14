package com.cms.shop.service;

import com.cms.shop.model.base.BuildingFinishing;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :装修列表服务
 * @Date : 16-11-6
 */
public interface BuildingFinishingService {

    Page<BuildingFinishing> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);

    List<BuildingFinishing> queryAll();

}
