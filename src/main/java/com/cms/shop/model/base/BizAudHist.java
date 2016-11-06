package com.cms.shop.model.base;

import java.util.Date;

public class BizAudHist implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer bizAudId;

    private Integer auditOper;

    private Date auditDate;

    private Integer bizId;

    private Integer audId;

    public Integer getBizAudId() {
        return bizAudId;
    }

    public void setBizAudId(Integer bizAudId) {
        this.bizAudId = bizAudId;
    }

    public Integer getAuditOper() {
        return auditOper;
    }

    public void setAuditOper(Integer auditOper) {
        this.auditOper = auditOper;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public Integer getAudId() {
        return audId;
    }

    public void setAudId(Integer audId) {
        this.audId = audId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BizAudHist> T copy(T bean) {
        bean.setBizAudId(getBizAudId());
        bean.setAuditOper(getAuditOper());
        bean.setAuditDate(getAuditDate());
        bean.setBizId(getBizId());
        bean.setAudId(getAudId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"bizAudId:" + getBizAudId() + 
        	", auditOper:" + getAuditOper() + 
        	", auditDate:" + getAuditDate() + 
        	", bizId:" + getBizId() + 
        	", audId:" + getAudId() + 
        "}";
    }
}