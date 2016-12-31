package com.cms.shop.model.base;

import java.util.Date;

public class Advert implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer adId;

    private String adName;

    private String picName;

    private String newPicName;

    private String url;

    private Integer adStatus;

    private Integer audStatus;

    private Integer adLoc;

    private String creater;

    private Date createDate;

    private Integer editTag;

    private Integer priority;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getNewPicName() {
        return newPicName;
    }

    public void setNewPicName(String newPicName) {
        this.newPicName = newPicName == null ? null : newPicName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }

    public Integer getAudStatus() {
        return audStatus;
    }

    public void setAudStatus(Integer audStatus) {
        this.audStatus = audStatus;
    }

    public Integer getAdLoc() {
        return adLoc;
    }

    public void setAdLoc(Integer adLoc) {
        this.adLoc = adLoc;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Advert> T copy(T bean) {
        bean.setAdId(getAdId());
        bean.setAdName(getAdName());
        bean.setPicName(getPicName());
        bean.setNewPicName(getNewPicName());
        bean.setUrl(getUrl());
        bean.setAdStatus(getAdStatus());
        bean.setAudStatus(getAudStatus());
        bean.setAdLoc(getAdLoc());
        bean.setCreater(getCreater());
        bean.setCreateDate(getCreateDate());
        bean.setEditTag(getEditTag());
        bean.setPriority(getPriority());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"adId:" + getAdId() + 
        	", adName:" + getAdName() + 
        	", picName:" + getPicName() + 
        	", newPicName:" + getNewPicName() + 
        	", url:" + getUrl() + 
        	", adStatus:" + getAdStatus() + 
        	", audStatus:" + getAudStatus() + 
        	", adLoc:" + getAdLoc() + 
        	", creater:" + getCreater() + 
        	", createDate:" + getCreateDate() + 
        	", editTag:" + getEditTag() + 
        	", priority:" + getPriority() + 
        "}";
    }
}