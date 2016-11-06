package com.cms.shop.model.base;

import java.util.Date;

public class AdAudHist implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer adAudId;

    private Integer auditOper;

    private Date auditDate;

    private String auditorName;

    private Integer adId;

    public Integer getAdAudId() {
        return adAudId;
    }

    public void setAdAudId(Integer adAudId) {
        this.adAudId = adAudId;
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

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends AdAudHist> T copy(T bean) {
        bean.setAdAudId(getAdAudId());
        bean.setAuditOper(getAuditOper());
        bean.setAuditDate(getAuditDate());
        bean.setAuditorName(getAuditorName());
        bean.setAdId(getAdId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"adAudId:" + getAdAudId() + 
        	", auditOper:" + getAuditOper() + 
        	", auditDate:" + getAuditDate() + 
        	", auditorName:" + getAuditorName() + 
        	", adId:" + getAdId() + 
        "}";
    }
}