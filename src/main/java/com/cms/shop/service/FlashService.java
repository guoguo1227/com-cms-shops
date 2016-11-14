package com.cms.shop.service;

import com.cms.shop.model.base.Flash;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description : flash服务接口
 * @Date : 16-11-11
 */
public interface FlashService {

    Page<Flash> queryListByCondition(SearchCondition condition);

    RequestResult offlineFlash(Integer id);

    RequestResult onlineFlash(Integer id);
}
