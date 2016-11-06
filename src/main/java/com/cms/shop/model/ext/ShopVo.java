package com.cms.shop.model.ext;

import com.cms.shop.model.base.Shop;

/**
 * @author : samuel
 * @Description : 商铺rest层对象
 * @Date : 16-11-5
 */
public class ShopVo{

    private Shop shop;

    private String districtStr; //所在地区

    private String buildingFinishing ;//装修情况

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getDistrictStr() {
        return districtStr;
    }

    public void setDistrictStr(String districtStr) {
        this.districtStr = districtStr;
    }

    public String getBuildingFinishing() {
        return buildingFinishing;
    }

    public void setBuildingFinishing(String buildingFinishing) {
        this.buildingFinishing = buildingFinishing;
    }
}
