package com.cms.shop.service;

import com.cms.shop.model.base.BuildingOccupancy;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description : 适宜业态服务
 * @Date : 16-11-6
 */
public interface BuildingOccupancyService {

    Page<BuildingOccupancy> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);

    List<BuildingOccupancy> queryAll();
}