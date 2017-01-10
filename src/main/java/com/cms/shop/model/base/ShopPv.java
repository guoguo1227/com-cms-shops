package com.cms.shop.model.base;

import java.util.Date;

public class ShopPv implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer type;

    private Integer relateId;

    private Integer relateType;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRelateId() {
        return relateId;
    }

    public void setRelateId(Integer relateId) {
        this.relateId = relateId;
    }

    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends ShopPv> T copy(T bean) {
        bean.setId(getId());
        bean.setType(getType());
        bean.setRelateId(getRelateId());
        bean.setRelateType(getRelateType());
        bean.setCreateDate(getCreateDate());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", type:" + getType() + 
        	", relateId:" + getRelateId() + 
        	", relateType:" + getRelateType() + 
        	", createDate:" + getCreateDate() + 
        "}";
    }
}