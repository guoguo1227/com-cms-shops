package com.cms.shop.model.base;

public class BizImg implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer imgId;

    private String fileName;

    private Integer bizId;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BizImg> T copy(T bean) {
        bean.setImgId(getImgId());
        bean.setFileName(getFileName());
        bean.setBizId(getBizId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"imgId:" + getImgId() + 
        	", fileName:" + getFileName() + 
        	", bizId:" + getBizId() + 
        "}";
    }
}