package com.cms.shop.model.base;

import java.util.Date;

public class BizqaReply implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer replyId;

    private String replyContent;

    private String creater;

    private Date createTime;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BizqaReply> T copy(T bean) {
        bean.setReplyId(getReplyId());
        bean.setReplyContent(getReplyContent());
        bean.setCreater(getCreater());
        bean.setCreateTime(getCreateTime());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"replyId:" + getReplyId() + 
        	", replyContent:" + getReplyContent() + 
        	", creater:" + getCreater() + 
        	", createTime:" + getCreateTime() + 
        "}";
    }
}