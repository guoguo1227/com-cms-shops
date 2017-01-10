package com.cms.shop.enums;

/**
 * Created by samuel on 17-1-9.
 */
public enum ShopPVEnum {

    SHOP(1, "商铺"),
    BUSINESS(2, "电子商务"),
    AD(3, "广告"),
    QQ(4, "在线客服");

    private Integer key;

    private String description;

    ShopPVEnum(Integer key,String description){
        this.key = key;
        this.description = description;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
