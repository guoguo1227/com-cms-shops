package com.cms.shop.service;

import com.cms.shop.model.base.Flash;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;
import org.apache.log4j.varia.FallbackErrorHandler;

/**
 * @author : samuel
 * @Description : flash服务接口
 * @Date : 16-11-11
 */
public interface FlashService {

    Page<Flash> queryListByCondition(SearchCondition condition);

    Flash queryFlash();

    RequestResult offlineFlash(Integer id);

    RequestResult onlineFlash(Integer id);

    RequestResult addFlash(Flash flash);
}
