package com.cms.shop.enums;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-8
 */
public enum CheckStatusEnum {

    AUDIT(0, "未审核"),
    PASS(1, "审核通过"),
    NOPASS(2, "审核未通过");

    private Integer key;
    private String description;

    CheckStatusEnum(Integer key, String description) {
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
