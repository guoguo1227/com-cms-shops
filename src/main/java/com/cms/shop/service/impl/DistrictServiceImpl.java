package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.DistrictMapper;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.DistrictCriteria;
import com.cms.shop.model.base.ShopCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.service.DistrictService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :地区列表服务
 * @Date : 16-11-6
 */
@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public Page<District> queryListByCondition(SearchCondition condition) {
        Page<District> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            DistrictCriteria criteria = new DistrictCriteria();
            //排序
            criteria.setOrderByClause(" priority desc ");
            int count = districtMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<District> districtList = districtMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(districtList)){
                    page.setPageData(districtList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<District> queryAll() {
        DistrictCriteria criteria = new DistrictCriteria();
        criteria.setOrderByClause(" priority ");
        List<District> districtList = districtMapper.selectByExample(criteria);
        return districtList;
    }

    @Override
    public boolean updatePriority(Integer id, boolean upflag) {
        boolean success = false;
        if(null != id){
            District district = districtMapper.selectByPrimaryKey(id);
            if(null != district){
                if(upflag){
                    if(district.getPriority()>1){
                        district.setPriority(district.getPriority()-1);
                    }else{
                        district.setPriority(1);
                    }
                }else{
                    district.setPriority(district.getPriority()+1);
                }
                int i = districtMapper.updateByPrimaryKeySelective(district);
                if(i>0){
                    success = true;
                }
            }
        }
        return success;
    }

    @Override
    public boolean deleteDistrictById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = districtMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean addDistrict(District district) {
        boolean success = false;
        if(null != district){
            int i = districtMapper.insertSelective(district);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean updateDistrict(District district) {
        boolean success = false;
        if(null != district && null != district.getDistrictId()){
            District tmp = districtMapper.selectByPrimaryKey(district.getDistrictId());
            if(null != tmp){
                tmp.setDistrictName(district.getDistrictName());
                tmp.setPriority(district.getPriority());
                int i = districtMapper.updateByPrimaryKeySelective(tmp);
                if(i>0){
                    success = true;
                }
            }
        }
        return true;
    }

    @Override
    public District queryDistrictById(Integer id) {
        District district = null;
        if(null != id){
            district = districtMapper.selectByPrimaryKey(id);
        }
        return district;
    }
}