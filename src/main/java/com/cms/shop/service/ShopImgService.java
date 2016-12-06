package com.cms.shop.service;

import com.cms.shop.model.base.ShopImg;

import java.util.List;

/**
 * @author : samuel
 * @Description : 商铺图片服务接口
 * @Date : 16-11-9
 */
public interface ShopImgService {

    public ShopImg getImgByShopId(Integer id);

    boolean addShopImg(ShopImg img);

    public List<ShopImg> getImgListByShopId(Integer id);
}
