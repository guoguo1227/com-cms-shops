package com.cms.shop.service;

import com.cms.shop.model.base.Advert;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.utils.Page;

/**
 * @author : samuel
 * @Description :广告服务接口
 * @Date : 16-11-7
 */
public interface AdvertService {

    Page<Advert> queryAdvertPageByCondition(SearchCondition condition);

    RequestResult addAdvert(Advert advert);

    RequestResult deleteAdvertById(Integer id);

    RequestResult queryAdvertById(Integer id);

    RequestResult updateAdvert(Advert advert);
}
