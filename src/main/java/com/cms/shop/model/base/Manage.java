package com.cms.shop.model.base;

import java.util.Date;

public class Manage implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer type;

    private String name;

    private String title;

    private String description;

    private String picture;

    private Date createTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Manage> T copy(T bean) {
        bean.setId(getId());
        bean.setType(getType());
        bean.setName(getName());
        bean.setTitle(getTitle());
        bean.setDescription(getDescription());
        bean.setPicture(getPicture());
        bean.setCreateTime(getCreateTime());
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
        	", name:" + getName() + 
        	", title:" + getTitle() + 
        	", description:" + getDescription() + 
        	", picture:" + getPicture() + 
        	", createTime:" + getCreateTime() + 
        "}";
    }
}