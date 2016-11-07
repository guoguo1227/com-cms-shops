package com.cms.shop.service;

import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.utils.Page;


/**
 * @author : samuel
 * @Description : 商铺服务层接口
 * @Date : 16-11-5
 */
public interface ShopService {

    Page<ShopVo> queryListBySearchCondition(SearchCondition condition);
}
