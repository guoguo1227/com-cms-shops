package com.cms.shop.service;

import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.ShopImg;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.ShopVo;
import com.cms.shop.utils.Page;

import java.util.List;


/**
 * @author : samuel
 * @Description : 商铺服务层接口
 * @Date : 16-11-5
 */
public interface ShopService {

    Page<ShopVo> queryListBySearchCondition(SearchCondition condition);

    Page<ShopVo> queryCheckListBySearchCondition(SearchCondition condition);

    List<ShopVo> getOnList(ShopTypeEnum type);

    Shop queryShopById(Integer id);
}
