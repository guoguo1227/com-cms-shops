package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.DistrictMapper;
import com.cms.shop.dao.base.mapper.StreetMapper;
import com.cms.shop.model.base.District;
import com.cms.shop.model.base.Street;
import com.cms.shop.model.base.StreetCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.StreetVo;
import com.cms.shop.service.StreetService;
import com.cms.shop.utils.BeanUtilExt;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : samuel
 * @Description :街道服务
 * @Date : 16-11-6
 */
@Service
public class StreetServiceImpl implements StreetService{

    @Autowired
    private StreetMapper streetMapper;

    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public Page<Street> queryPageByCondition(SearchCondition condition) {
        Page<Street> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            StreetCriteria criteria = new StreetCriteria();
            int count = streetMapper.countByExample(criteria);
            criteria.setOrderByClause(" STREET_ID desc ");
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Street> streetList = streetMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(streetList)){
                    page.setPageData(streetList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public Page<StreetVo> queryVoByCondtion(SearchCondition condition) {
        Page<StreetVo> page = null;
        List<StreetVo> voList = new ArrayList<>();
        if(null != condition){
            page = new Page<>();
            page.setPageSize(condition.getLimit());

            StreetCriteria criteria = new StreetCriteria();
            if(null != condition.getDistrictId()){
                criteria.createCriteria().andDistrictIdEqualTo(condition.getDistrictId());
            }
            criteria.setOrderByClause(" STREET_ID desc ");
            int count = streetMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Street> streetList = streetMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(streetList)){
                    for(Street street : streetList){
                        StreetVo streetVo = new StreetVo();
                        try {
                            BeanUtilExt.copyProperties(streetVo,street);
                            if(null != street.getDistrictId()){
                                District district = districtMapper.selectByPrimaryKey(street.getDistrictId());
                                if(null != district){
                                    streetVo.setDistrictName(district.getDistrictName());
                                }
                            }

                            voList.add(streetVo);
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    page.setPageData(voList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public List<Street> queryAll() {
        StreetCriteria criteria = new StreetCriteria();
        return streetMapper.selectByExample(criteria);
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean success = false;
        if(null != id){
            int i = streetMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean addStreet(Street street) {
        boolean success = false;
        if(null != street){
            int i = streetMapper.insertSelective(street);
            if(i>0){
                success = true;
            }
        }
        return success;
    }

    @Override
    public boolean updateStreet(Street street) {
        boolean success = false;
        if(null != street && null != street.getStreetId()){
            Street tmp = streetMapper.selectByPrimaryKey(street.getStreetId());
            if(null != tmp){
                tmp.setStreetName(street.getStreetName());
                tmp.setDistrictId(street.getDistrictId());
                int i = streetMapper.updateByPrimaryKeySelective(tmp);
                if(i>0){
                    success = true;
                }
            }
        }
        return success;
    }
}
