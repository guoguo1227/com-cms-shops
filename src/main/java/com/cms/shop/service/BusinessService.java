package com.cms.shop.service;

import com.cms.shop.model.base.Business;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description : 招商服务接口
 * @Date : 16-11-9
 */
public interface BusinessService {

    List<Business> getOnList();

    Page<Business> queryPageByCondition(SearchCondition condition);

    RequestResult addBusiness(Business business);

    RequestResult updateBusiness(Business business);

}
