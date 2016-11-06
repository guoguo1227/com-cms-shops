package com.cms.shop.model.base;

import java.util.Date;

public class RentHistory implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer rentId;

    private Integer rentStatus;

    private Integer auditLevel;

    private Date applyDate;

    private Date replyDate;

    private Integer priority;

    private Integer shopId;

    private Integer renterId;

    private Integer infoId;

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public Integer getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(Integer rentStatus) {
        this.rentStatus = rentStatus;
    }

    public Integer getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(Integer auditLevel) {
        this.auditLevel = auditLevel;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getRenterId() {
        return renterId;
    }

    public void setRenterId(Integer renterId) {
        this.renterId = renterId;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends RentHistory> T copy(T bean) {
        bean.setRentId(getRentId());
        bean.setRentStatus(getRentStatus());
        bean.setAuditLevel(getAuditLevel());
        bean.setApplyDate(getApplyDate());
        bean.setReplyDate(getReplyDate());
        bean.setPriority(getPriority());
        bean.setShopId(getShopId());
        bean.setRenterId(getRenterId());
        bean.setInfoId(getInfoId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"rentId:" + getRentId() + 
        	", rentStatus:" + getRentStatus() + 
        	", auditLevel:" + getAuditLevel() + 
        	", applyDate:" + getApplyDate() + 
        	", replyDate:" + getReplyDate() + 
        	", priority:" + getPriority() + 
        	", shopId:" + getShopId() + 
        	", renterId:" + getRenterId() + 
        	", infoId:" + getInfoId() + 
        "}";
    }
}