package com.cms.shop.service;

import com.cms.shop.enums.ShopTypeEnum;
import com.cms.shop.model.base.Business;
import com.cms.shop.model.base.Investment;
import com.cms.shop.model.base.Shop;
import com.cms.shop.model.base.ShopImg;
import com.cms.shop.model.condition.SearchCondition;
import com.cms.shop.model.ext.RequestResult;
import com.cms.shop.model.ext.ShopExt;
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

    List<Shop> queryList(SearchCondition condition);

    ShopExt queryShopDetailById(Integer id);

    Page<ShopVo> queryCheckListBySearchCondition(SearchCondition condition);

    List<ShopVo> getOnList(ShopTypeEnum type,Integer limit);

    Shop queryShopById(Integer id);

    RequestResult updateShopType(Integer id,Integer type);

    RequestResult updateRoad(Integer id,String road);

    RequestResult checkShop(Integer id,boolean ifPass);

    RequestResult addShop(ShopExt ext);

    RequestResult updateShop(Shop shop);

    Investment queryInvestment();

    RequestResult updateInvestment(Investment investment);
}
