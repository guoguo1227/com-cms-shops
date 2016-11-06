package com.cms.shop.model.base;

public class Flash implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String oldName;

    private String flashName;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName == null ? null : oldName.trim();
    }

    public String getFlashName() {
        return flashName;
    }

    public void setFlashName(String flashName) {
        this.flashName = flashName == null ? null : flashName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Flash> T copy(T bean) {
        bean.setId(getId());
        bean.setOldName(getOldName());
        bean.setFlashName(getFlashName());
        bean.setStatus(getStatus());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", oldName:" + getOldName() + 
        	", flashName:" + getFlashName() + 
        	", status:" + getStatus() + 
        "}";
    }
}