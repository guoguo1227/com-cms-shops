package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.ArchitectureMapper;
import com.cms.shop.model.base.Architecture;
import com.cms.shop.model.base.ArchitectureCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.ArchitectureService;
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
public class ArchitectureServiceImpl implements ArchitectureService{

    @Autowired
    private ArchitectureMapper architectureMapper;

    @Override
    public Page<Architecture> queryPageByCondition(SearchCondition condition) {
        Page<Architecture> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            ArchitectureCriteria criteria = new ArchitectureCriteria();
            //排序
            criteria.setOrderByClause(" ARCHI_ID desc ");
            int count = architectureMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Architecture> architectureList = architectureMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(architectureList)){
                    page.setPageData(architectureList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<Architecture> queryAll() {
        ArchitectureCriteria criteria = new ArchitectureCriteria();
        return architectureMapper.selectByExample(criteria);
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = architectureMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean addArchitecture(Architecture architecture) {
        boolean success = false;
        if(null != architecture){
            int i = architectureMapper.insertSelective(architecture);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean updateArchitecture(Architecture architecture) {
        boolean success = false;
        if(null != architecture && null != architecture.getArchiId()){
            Architecture tmp = architectureMapper.selectByPrimaryKey(architecture.getArchiId());
            if(null != tmp){
                tmp.setArchiName(architecture.getArchiName());
                int i = architectureMapper.updateByPrimaryKeySelective(tmp);
                if(i>0){
                    success = true;
                }
            }

        }
        return success;
    }
}
