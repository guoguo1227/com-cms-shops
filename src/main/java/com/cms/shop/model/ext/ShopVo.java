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

    private String buildingOccupancy;

    private String filePath; //图片路径

    private String shopType;//物业性质

    private String facility; //配套设施

    private String deposit; //保证金

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getBuildingOccupancy() {
        return buildingOccupancy;
    }

    public void setBuildingOccupancy(String buildingOccupancy) {
        this.buildingOccupancy = buildingOccupancy;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

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
