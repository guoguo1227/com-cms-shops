package com.cms.shop.model.base;

import java.util.Date;

public class RentAudHist implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer rentAudId;

    private Date audDate;

    private Integer audOper;

    private String auditorName;

    private Integer auditId;

    private Integer histId;

    private String audComment;

    public Integer getRentAudId() {
        return rentAudId;
    }

    public void setRentAudId(Integer rentAudId) {
        this.rentAudId = rentAudId;
    }

    public Date getAudDate() {
        return audDate;
    }

    public void setAudDate(Date audDate) {
        this.audDate = audDate;
    }

    public Integer getAudOper() {
        return audOper;
    }

    public void setAudOper(Integer audOper) {
        this.audOper = audOper;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getHistId() {
        return histId;
    }

    public void setHistId(Integer histId) {
        this.histId = histId;
    }

    public String getAudComment() {
        return audComment;
    }

    public void setAudComment(String audComment) {
        this.audComment = audComment == null ? null : audComment.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends RentAudHist> T copy(T bean) {
        bean.setRentAudId(getRentAudId());
        bean.setAudDate(getAudDate());
        bean.setAudOper(getAudOper());
        bean.setAuditorName(getAuditorName());
        bean.setAuditId(getAuditId());
        bean.setHistId(getHistId());
        bean.setAudComment(getAudComment());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"rentAudId:" + getRentAudId() + 
        	", audDate:" + getAudDate() + 
        	", audOper:" + getAudOper() + 
        	", auditorName:" + getAuditorName() + 
        	", auditId:" + getAuditId() + 
        	", histId:" + getHistId() + 
        	", audComment:" + getAudComment() + 
        "}";
    }
}