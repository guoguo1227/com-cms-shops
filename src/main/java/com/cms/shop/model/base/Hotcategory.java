package com.cms.shop.model.base;

public class Hotcategory implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer hotId;

    private String hotName;

    private Integer priority;

    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    public String getHotName() {
        return hotName;
    }

    public void setHotName(String hotName) {
        this.hotName = hotName == null ? null : hotName.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Hotcategory> T copy(T bean) {
        bean.setHotId(getHotId());
        bean.setHotName(getHotName());
        bean.setPriority(getPriority());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"hotId:" + getHotId() + 
        	", hotName:" + getHotName() + 
        	", priority:" + getPriority() + 
        "}";
    }
}