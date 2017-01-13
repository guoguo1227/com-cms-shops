package com.cms.shop.model.base;

public class Hotcategory implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer hotId;

    private String hotName;

    private Integer priority;

    private Integer priority2;

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

    public Integer getPriority2() {
        return priority2;
    }

    public void setPriority2(Integer priority2) {
        this.priority2 = priority2;
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
        bean.setPriority2(getPriority2());
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
        	", priority2:" + getPriority2() + 
        "}";
    }
}