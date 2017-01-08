package com.cms.shop.service;

import com.cms.shop.model.base.ShopType;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.utils.Page;

import java.util.List;

/**
 * @author : samuel
 * @Description :物业性质服务
 * @Date : 16-11-6
 */
public interface ShopTypeService {

    Page<ShopType> queryPageByCondition(SearchCondition condition);

    boolean deleteById(Integer id);

    boolean addShopType(ShopType shopType);

    boolean updateShopType(ShopType shopType);

    ShopType queryShopTypeById(Integer id);

    List<ShopType> queryAll();
}
