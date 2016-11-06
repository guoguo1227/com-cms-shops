package com.cms.shop.model.base;

public class Partner implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer partnerId;

    private String partnerName;

    private String fileName;

    private String url;

    private Integer status;

    private Integer editTag;

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Partner> T copy(T bean) {
        bean.setPartnerId(getPartnerId());
        bean.setPartnerName(getPartnerName());
        bean.setFileName(getFileName());
        bean.setUrl(getUrl());
        bean.setStatus(getStatus());
        bean.setEditTag(getEditTag());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"partnerId:" + getPartnerId() + 
        	", partnerName:" + getPartnerName() + 
        	", fileName:" + getFileName() + 
        	", url:" + getUrl() + 
        	", status:" + getStatus() + 
        	", editTag:" + getEditTag() + 
        "}";
    }
}