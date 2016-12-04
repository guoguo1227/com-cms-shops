package com.cms.shop.service;

import com.cms.shop.model.base.BuildingFacility;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :配套设施服务
 * @Date : 16-11-6
 */
public interface BuildingFacilityService {

    Page<BuildingFacility> queryPageByCondition(SearchCondition condition);

    List<BuildingFacility> queryAll();

    boolean deleteById(Integer id);

    boolean addBuildingFacility(BuildingFacility buildingFacility);
}
