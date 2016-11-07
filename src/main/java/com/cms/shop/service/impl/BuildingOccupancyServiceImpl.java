package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.BuildingOccupancyMapper;
import com.cms.shop.model.base.Architecture;
import com.cms.shop.model.base.ArchitectureCriteria;
import com.cms.shop.model.base.BuildingOccupancy;
import com.cms.shop.model.base.BuildingOccupancyCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.BuildingOccupancyService;
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
public class BuildingOccupancyServiceImpl implements BuildingOccupancyService {

    @Autowired
    private BuildingOccupancyMapper buildingOccupancyMapper;

    @Override
    public Page<BuildingOccupancy> queryPageByCondition(SearchCondition condition) {
        Page<BuildingOccupancy> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            BuildingOccupancyCriteria criteria = new BuildingOccupancyCriteria();
            //排序
            int count = buildingOccupancyMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<BuildingOccupancy> buildingOccupancyList = buildingOccupancyMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(buildingOccupancyList)){
                    page.setPageData(buildingOccupancyList);
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
            int i = buildingOccupancyMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }
}
