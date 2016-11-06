package com.cms.shop.model.base;

import java.util.Date;

public class CustAudHist implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer custAudId;

    private Integer auditOper;

    private Date auditDate;

    private String auditName;

    private String auditorName;

    private Integer customerId;

    public Integer getCustAudId() {
        return custAudId;
    }

    public void setCustAudId(Integer custAudId) {
        this.custAudId = custAudId;
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

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends CustAudHist> T copy(T bean) {
        bean.setCustAudId(getCustAudId());
        bean.setAuditOper(getAuditOper());
        bean.setAuditDate(getAuditDate());
        bean.setAuditName(getAuditName());
        bean.setAuditorName(getAuditorName());
        bean.setCustomerId(getCustomerId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"custAudId:" + getCustAudId() + 
        	", auditOper:" + getAuditOper() + 
        	", auditDate:" + getAuditDate() + 
        	", auditName:" + getAuditName() + 
        	", auditorName:" + getAuditorName() + 
        	", customerId:" + getCustomerId() + 
        "}";
    }
}