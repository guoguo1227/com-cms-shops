package com.cms.shop.model.ext;

import com.cms.shop.model.base.Hotcategory;
import com.cms.shop.model.base.Shop;

import java.util.List;

/**
 * Created by samuel on 17-1-1.
 */
public class HotcategoryVo {

    private List<Shop> shopList;

    private Hotcategory hotcategory;

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    public Hotcategory getHotcategory() {
        return hotcategory;
    }

    public void setHotcategory(Hotcategory hotcategory) {
        this.hotcategory = hotcategory;
    }
}
