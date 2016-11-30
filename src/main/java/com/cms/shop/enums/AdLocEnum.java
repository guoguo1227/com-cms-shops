package com.cms.shop.enums;

/**
 * @author : samuel
 * @Description : 广告位置枚举
 * @Date : 16-11-8
 */
public enum AdLocEnum {

    INDEXTOP(1, "首页上部"),
    INDEXCENTER(2, "首页中部"),
    INDEXLEFT(3, "首页左部"),
    SONTOP(4, "2级页面左部"),
    SONBOTTOM(5, "2级页面下部");

    private Integer key;
    private String description;

    AdLocEnum(Integer key, String description) {
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
