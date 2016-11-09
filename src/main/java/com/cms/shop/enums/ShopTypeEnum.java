package com.cms.shop.enums;

/**
 * 商铺类型枚举
 */
public enum ShopTypeEnum {

    GOOD(-1, "好铺"),
    FIRE(0, "旺铺");

    private Integer key;
    private String description;

    ShopTypeEnum(Integer key, String description) {
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
