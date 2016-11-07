package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.BuildingFinishingMapper;
import com.cms.shop.model.base.*;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.BuildingFinishingService;
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
public class BuildingFinishingServiceImpl implements BuildingFinishingService{

    @Autowired
    private BuildingFinishingMapper buildingFinishingMapper;

    @Override
    public Page<BuildingFinishing> queryPageByCondition(SearchCondition condition) {
        Page<BuildingFinishing> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            BuildingFinishingCriteria criteria = new BuildingFinishingCriteria();
            int count = buildingFinishingMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<BuildingFinishing> buildingFinishingList= buildingFinishingMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(buildingFinishingList)){
                    page.setPageData(buildingFinishingList);
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
            int i = buildingFinishingMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }
}
