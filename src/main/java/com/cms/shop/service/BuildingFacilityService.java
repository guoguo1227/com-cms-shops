package com.cms.shop.service;

import com.cms.shop.model.base.BuildingFacility;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :配套设施服务
 * @Date : 16-11-6
 */
public interface BuildingFacilityService {

    Page<BuildingFacility> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);
}
