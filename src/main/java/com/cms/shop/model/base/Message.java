package com.cms.shop.model.base;

import java.util.Date;

public class Message implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer msgId;

    private Date msgDate;

    private String msgContent;

    private Integer msgStatus;

    private Integer msgTypeId;

    private Integer userId;

    private Integer customerId;

    private String msgTitle;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public Integer getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Integer getMsgTypeId() {
        return msgTypeId;
    }

    public void setMsgTypeId(Integer msgTypeId) {
        this.msgTypeId = msgTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Message> T copy(T bean) {
        bean.setMsgId(getMsgId());
        bean.setMsgDate(getMsgDate());
        bean.setMsgContent(getMsgContent());
        bean.setMsgStatus(getMsgStatus());
        bean.setMsgTypeId(getMsgTypeId());
        bean.setUserId(getUserId());
        bean.setCustomerId(getCustomerId());
        bean.setMsgTitle(getMsgTitle());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"msgId:" + getMsgId() + 
        	", msgDate:" + getMsgDate() + 
        	", msgContent:" + getMsgContent() + 
        	", msgStatus:" + getMsgStatus() + 
        	", msgTypeId:" + getMsgTypeId() + 
        	", userId:" + getUserId() + 
        	", customerId:" + getCustomerId() + 
        	", msgTitle:" + getMsgTitle() + 
        "}";
    }
}