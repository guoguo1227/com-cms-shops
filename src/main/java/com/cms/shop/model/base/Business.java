package com.cms.shop.model.base;

import java.util.Date;

public class Business implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer bizId;

    private String bizName;

    private String bizContent;

    private Integer bizStatus;

    private Date createDate;

    private Date offsellDate;

    private Integer editTag;

    private String fileName;

    private Date onsellDate;

    private String publisher;

    private Integer creId;

    private Integer audStatus;

    private String fileName2;

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName == null ? null : bizName.trim();
    }

    public String getBizContent() {
        return bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent == null ? null : bizContent.trim();
    }

    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getOffsellDate() {
        return offsellDate;
    }

    public void setOffsellDate(Date offsellDate) {
        this.offsellDate = offsellDate;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getOnsellDate() {
        return onsellDate;
    }

    public void setOnsellDate(Date onsellDate) {
        this.onsellDate = onsellDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Integer getCreId() {
        return creId;
    }

    public void setCreId(Integer creId) {
        this.creId = creId;
    }

    public Integer getAudStatus() {
        return audStatus;
    }

    public void setAudStatus(Integer audStatus) {
        this.audStatus = audStatus;
    }

    public String getFileName2() {
        return fileName2;
    }

    public void setFileName2(String fileName2) {
        this.fileName2 = fileName2 == null ? null : fileName2.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Business> T copy(T bean) {
        bean.setBizId(getBizId());
        bean.setBizName(getBizName());
        bean.setBizContent(getBizContent());
        bean.setBizStatus(getBizStatus());
        bean.setCreateDate(getCreateDate());
        bean.setOffsellDate(getOffsellDate());
        bean.setEditTag(getEditTag());
        bean.setFileName(getFileName());
        bean.setOnsellDate(getOnsellDate());
        bean.setPublisher(getPublisher());
        bean.setCreId(getCreId());
        bean.setAudStatus(getAudStatus());
        bean.setFileName2(getFileName2());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"bizId:" + getBizId() + 
        	", bizName:" + getBizName() + 
        	", bizContent:" + getBizContent() + 
        	", bizStatus:" + getBizStatus() + 
        	", createDate:" + getCreateDate() + 
        	", offsellDate:" + getOffsellDate() + 
        	", editTag:" + getEditTag() + 
        	", fileName:" + getFileName() + 
        	", onsellDate:" + getOnsellDate() + 
        	", publisher:" + getPublisher() + 
        	", creId:" + getCreId() + 
        	", audStatus:" + getAudStatus() + 
        	", fileName2:" + getFileName2() + 
        "}";
    }
}