package com.cms.shop.model.base;

public class CustomerFile implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer fileId;

    private String fileName;

    private String newFileName;

    private Integer fileType;

    private Integer customerId;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName == null ? null : newFileName.trim();
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
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
    public  <T extends CustomerFile> T copy(T bean) {
        bean.setFileId(getFileId());
        bean.setFileName(getFileName());
        bean.setNewFileName(getNewFileName());
        bean.setFileType(getFileType());
        bean.setCustomerId(getCustomerId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"fileId:" + getFileId() + 
        	", fileName:" + getFileName() + 
        	", newFileName:" + getNewFileName() + 
        	", fileType:" + getFileType() + 
        	", customerId:" + getCustomerId() + 
        "}";
    }
}