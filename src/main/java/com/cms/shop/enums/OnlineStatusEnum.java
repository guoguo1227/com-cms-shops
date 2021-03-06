package com.cms.shop.enums;

/**
 * @author : samuel
 * @Description : 上架状态枚举
 * @Date : 16-11-8
 */
public enum OnlineStatusEnum {

    WAIT(0, "未上架"),
    ONLINE(1, "上架"),
    OFFLINE(2, "下架");

    private Integer key;
    private String description;

    OnlineStatusEnum(Integer key, String description) {
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
