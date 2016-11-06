package com.cms.shop.model.base;

import java.util.Date;

public class BrdAudHist implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer brdAudId;

    private Integer auditOper;

    private Date auditDate;

    private Integer brdId;

    private Integer audId;

    public Integer getBrdAudId() {
        return brdAudId;
    }

    public void setBrdAudId(Integer brdAudId) {
        this.brdAudId = brdAudId;
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

    public Integer getBrdId() {
        return brdId;
    }

    public void setBrdId(Integer brdId) {
        this.brdId = brdId;
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
    public  <T extends BrdAudHist> T copy(T bean) {
        bean.setBrdAudId(getBrdAudId());
        bean.setAuditOper(getAuditOper());
        bean.setAuditDate(getAuditDate());
        bean.setBrdId(getBrdId());
        bean.setAudId(getAudId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"brdAudId:" + getBrdAudId() + 
        	", auditOper:" + getAuditOper() + 
        	", auditDate:" + getAuditDate() + 
        	", brdId:" + getBrdId() + 
        	", audId:" + getAudId() + 
        "}";
    }
}