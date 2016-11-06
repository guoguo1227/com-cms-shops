package com.cms.shop.model.base;

import java.util.Date;

public class Bizqa implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer qaId;

    private String content;

    private Integer auditStatus;

    private Integer askerId;

    private Date createDate;

    private String reply;

    private String askerName;

    private Date replyDate;

    private Integer replyStatus;

    private Date auditDate;

    private String askerLoc;

    private String askerPhone;

    private String askerMail;

    private Integer bizId;

    private Integer userId;

    public Integer getQaId() {
        return qaId;
    }

    public void setQaId(Integer qaId) {
        this.qaId = qaId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getAskerId() {
        return askerId;
    }

    public void setAskerId(Integer askerId) {
        this.askerId = askerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public String getAskerName() {
        return askerName;
    }

    public void setAskerName(String askerName) {
        this.askerName = askerName == null ? null : askerName.trim();
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAskerLoc() {
        return askerLoc;
    }

    public void setAskerLoc(String askerLoc) {
        this.askerLoc = askerLoc == null ? null : askerLoc.trim();
    }

    public String getAskerPhone() {
        return askerPhone;
    }

    public void setAskerPhone(String askerPhone) {
        this.askerPhone = askerPhone == null ? null : askerPhone.trim();
    }

    public String getAskerMail() {
        return askerMail;
    }

    public void setAskerMail(String askerMail) {
        this.askerMail = askerMail == null ? null : askerMail.trim();
    }

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Bizqa> T copy(T bean) {
        bean.setQaId(getQaId());
        bean.setContent(getContent());
        bean.setAuditStatus(getAuditStatus());
        bean.setAskerId(getAskerId());
        bean.setCreateDate(getCreateDate());
        bean.setReply(getReply());
        bean.setAskerName(getAskerName());
        bean.setReplyDate(getReplyDate());
        bean.setReplyStatus(getReplyStatus());
        bean.setAuditDate(getAuditDate());
        bean.setAskerLoc(getAskerLoc());
        bean.setAskerPhone(getAskerPhone());
        bean.setAskerMail(getAskerMail());
        bean.setBizId(getBizId());
        bean.setUserId(getUserId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"qaId:" + getQaId() + 
        	", content:" + getContent() + 
        	", auditStatus:" + getAuditStatus() + 
        	", askerId:" + getAskerId() + 
        	", createDate:" + getCreateDate() + 
        	", reply:" + getReply() + 
        	", askerName:" + getAskerName() + 
        	", replyDate:" + getReplyDate() + 
        	", replyStatus:" + getReplyStatus() + 
        	", auditDate:" + getAuditDate() + 
        	", askerLoc:" + getAskerLoc() + 
        	", askerPhone:" + getAskerPhone() + 
        	", askerMail:" + getAskerMail() + 
        	", bizId:" + getBizId() + 
        	", userId:" + getUserId() + 
        "}";
    }
}