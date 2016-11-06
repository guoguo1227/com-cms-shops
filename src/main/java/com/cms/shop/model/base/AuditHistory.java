package com.cms.shop.model.base;

import java.util.Date;

public class AuditHistory implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer auditId;

    private Integer auditOper;

    private String auditComment;

    private String auditor;

    private Date auditDate;

    private Integer proposalOper;

    private Integer shopId;

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getAuditOper() {
        return auditOper;
    }

    public void setAuditOper(Integer auditOper) {
        this.auditOper = auditOper;
    }

    public String getAuditComment() {
        return auditComment;
    }

    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment == null ? null : auditComment.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getProposalOper() {
        return proposalOper;
    }

    public void setProposalOper(Integer proposalOper) {
        this.proposalOper = proposalOper;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends AuditHistory> T copy(T bean) {
        bean.setAuditId(getAuditId());
        bean.setAuditOper(getAuditOper());
        bean.setAuditComment(getAuditComment());
        bean.setAuditor(getAuditor());
        bean.setAuditDate(getAuditDate());
        bean.setProposalOper(getProposalOper());
        bean.setShopId(getShopId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"auditId:" + getAuditId() + 
        	", auditOper:" + getAuditOper() + 
        	", auditComment:" + getAuditComment() + 
        	", auditor:" + getAuditor() + 
        	", auditDate:" + getAuditDate() + 
        	", proposalOper:" + getProposalOper() + 
        	", shopId:" + getShopId() + 
        "}";
    }
}