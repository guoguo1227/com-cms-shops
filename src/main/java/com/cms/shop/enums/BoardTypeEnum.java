package com.cms.shop.enums;

/**
 * @author : samuel
 * @Description :公告类型枚举
 * @Date : 16-11-8
 */
public enum BoardTypeEnum {

    NOTICE(1, "公告栏"),
    SHOPABIT(2, "开店一点通"),
    POLICY(3, "政策法规"),
    KNOWLEDGE(4, "商铺知识"),
    NEWS(5, "北翼要闻"),
    BUSINESS(6, "商家动态");

    private Integer key;
    private String description;

    BoardTypeEnum(Integer key, String description) {
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
