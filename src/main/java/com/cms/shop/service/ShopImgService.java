package com.cms.shop.service;

import com.cms.shop.model.base.ShopImg;

/**
 * @author : samuel
 * @Description : 商铺图片服务接口
 * @Date : 16-11-9
 */
public interface ShopImgService {

    public ShopImg getImgByShopId(Integer id);
}
