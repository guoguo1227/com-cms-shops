package com.cms.shop.model.ext;

import com.cms.shop.model.base.Shop;

/**
 * @author : samuel
 * @Description : 商铺rest层对象
 * @Date : 16-11-5
 */
public class ShopVo{

    private Shop shop;

    private String districtStr = ""; //所在地区

    private String buildingFinishing = "" ;//装修情况

    private String buildingOccupancy = "";//适应业态

    private String filePath = ""; //图片路径

    private String shopType = "";//物业性质

    private String hotcatStr = ""; //商铺类型

    private String facility = ""; //配套设施

    private String deposit = ""; //保证金

    private String img1 = ""; //商铺图片1

    private String img2 = ""; //商铺图片2

    public String getHotcatStr() {
        return hotcatStr;
    }

    public void setHotcatStr(String hotcatStr) {
        this.hotcatStr = hotcatStr;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

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
