package com.cms.shop.service.impl;

import com.cms.shop.dao.base.mapper.AdvertMapper;
import com.cms.shop.model.base.Advert;
import com.cms.shop.model.base.AdvertCriteria;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.service.AdvertService;
import com.cms.shop.utils.Page;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-7
 */

@Service
public class AdvertServiceImpl implements AdvertService{

    private static final Logger logger = LoggerFactory.getLogger(AdvertServiceImpl.class);

    @Autowired
    private AdvertMapper advertMapper;

    @Override
    public Page<Advert> queryAdvertPageByCondition(SearchCondition condition) {
        Page<Advert> page = null;
        if(null != condition){
            page = new Page();
            page.setPageSize(condition.getLimit());

            AdvertCriteria criteria = new AdvertCriteria();
            int count = advertMapper.countByExample(criteria);
            if(count>0){
                criteria.setLimitStart(condition.getOffset());
                criteria.setLimitEnd(condition.getLimit());
                List<Advert> advertList = advertMapper.selectByExample(criteria);
                if(CollectionUtils.isNotEmpty(advertList)){
                    page.setPageData(advertList);
                }
            }
            page.setTotalCount(count);
        }
        return page;
    }

    @Override
    public RequestResult addAdvert(Advert advert) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != advert){
            int i = advertMapper.insertSelective(advert);
            if(i>0){
                success = true;
            }
        }else{
            message = "广告信息不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    @Override
    public RequestResult deleteAdvertById(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != id){
            int i = advertMapper.deleteByPrimaryKey(id);
            if(i>0){
                success = true;
            }
        }else{
            message = "id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;
    }

    @Override
    public RequestResult queryAdvertById(Integer id) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        Advert advert = null;
        if(null != id){
            advert = advertMapper.selectByPrimaryKey(id);
            if(null != advert){
                success = true;
            }
        }else{
            message = "id不可为空";
        }
        result.setSuccess(success);
        result.setMessage(message);
        result.setData(advert);
        return result;
    }

    @Override
    public RequestResult updateAdvert(Advert advert) {
        RequestResult result = new RequestResult();
        boolean success = false;
        String message = "";
        if(null != advert && null != advert.getAdId()){
            int i = advertMapper.updateByPrimaryKeySelective(advert);
            if(i>0){
                success = true;
            }
        }else{
            message = "广告id不可为空";
        }
        result.setMessage(message);
        result.setSuccess(success);
        return result;
    }
}
