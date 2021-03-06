package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.BuildingFacilityMapper;
import com.cms.shop.model.base.BuildingFacility;
import com.cms.shop.model.base.BuildingFacilityCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.BuildingFacilityService;
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
public class BuildingFacilityServiceImpl implements BuildingFacilityService{

    @Autowired
    private BuildingFacilityMapper buildingFacilityMapper;

    @Override
    public Page<BuildingFacility> queryPageByCondition(SearchCondition condition) {
        Page<BuildingFacility> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            BuildingFacilityCriteria criteria = new BuildingFacilityCriteria();
            criteria.setOrderByClause(" FACIL_ID desc ");
            int count = buildingFacilityMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<BuildingFacility> buildingFacilityList= buildingFacilityMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(buildingFacilityList)){
                    page.setPageData(buildingFacilityList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<BuildingFacility> queryAll() {
        BuildingFacilityCriteria criteria = new BuildingFacilityCriteria();
        return buildingFacilityMapper.selectByExample(criteria);
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = buildingFacilityMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean addBuildingFacility(BuildingFacility buildingFacility) {
        boolean success = false;
        if(null != buildingFacility){
            int i = buildingFacilityMapper.insertSelective(buildingFacility);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean updateBuildingFacility(BuildingFacility buildingFacility) {
        boolean success = false;
        if(null != buildingFacility && null != buildingFacility.getFacilId()){
            BuildingFacility tmp = buildingFacilityMapper.selectByPrimaryKey(buildingFacility.getFacilId());
            if(null != tmp){
                tmp.setFacilName(buildingFacility.getFacilName());
                int i = buildingFacilityMapper.updateByPrimaryKeySelective(tmp);
                if(i>0){
                    success = true;
                }
            }

        }
        return success;    }
}
