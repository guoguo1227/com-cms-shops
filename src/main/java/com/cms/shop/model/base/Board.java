package com.cms.shop.model.base;

import java.util.Date;

public class Board implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer brdId;

    private Integer brdType;

    private String brdTitle;

    private String brdContent;

    private Integer brdStatus;

    private Date createDate;

    private Integer creId;

    private Integer editTag;

    public Integer getBrdId() {
        return brdId;
    }

    public void setBrdId(Integer brdId) {
        this.brdId = brdId;
    }

    public Integer getBrdType() {
        return brdType;
    }

    public void setBrdType(Integer brdType) {
        this.brdType = brdType;
    }

    public String getBrdTitle() {
        return brdTitle;
    }

    public void setBrdTitle(String brdTitle) {
        this.brdTitle = brdTitle == null ? null : brdTitle.trim();
    }

    public String getBrdContent() {
        return brdContent;
    }

    public void setBrdContent(String brdContent) {
        this.brdContent = brdContent == null ? null : brdContent.trim();
    }

    public Integer getBrdStatus() {
        return brdStatus;
    }

    public void setBrdStatus(Integer brdStatus) {
        this.brdStatus = brdStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreId() {
        return creId;
    }

    public void setCreId(Integer creId) {
        this.creId = creId;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Board> T copy(T bean) {
        bean.setBrdId(getBrdId());
        bean.setBrdType(getBrdType());
        bean.setBrdTitle(getBrdTitle());
        bean.setBrdContent(getBrdContent());
        bean.setBrdStatus(getBrdStatus());
        bean.setCreateDate(getCreateDate());
        bean.setCreId(getCreId());
        bean.setEditTag(getEditTag());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"brdId:" + getBrdId() + 
        	", brdType:" + getBrdType() + 
        	", brdTitle:" + getBrdTitle() + 
        	", brdContent:" + getBrdContent() + 
        	", brdStatus:" + getBrdStatus() + 
        	", createDate:" + getCreateDate() + 
        	", creId:" + getCreId() + 
        	", editTag:" + getEditTag() + 
        "}";
    }
}