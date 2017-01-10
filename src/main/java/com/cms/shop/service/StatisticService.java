package com.cms.shop.service;

import com.cms.shop.model.base.ShopPv;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.Statistic;
import com.cms.shop.utils.Page;


/**
 * Created by samuel on 17-1-9.
 */
public interface StatisticService {

    Object[] queryListByCondition(SearchCondition condition);

    void addShopPV(ShopPv shopPv);

}
