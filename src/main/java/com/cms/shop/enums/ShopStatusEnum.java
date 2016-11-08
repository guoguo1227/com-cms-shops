package com.cms.shop.enums;

public enum ShopStatusEnum {

    DELETE(-1, "已删除"),
    WAIT(0, "待上架"),
    ONLINE(1, "上架"),
    OFFLINE(2, "下架");

    private Integer key;
    private String description;

    ShopStatusEnum(Integer key, String description) {
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
