package com.cms.shop.model.base;

public class Investment implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String type;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Investment> T copy(T bean) {
        bean.setId(getId());
        bean.setName(getName());
        bean.setType(getType());
        bean.setDescription(getDescription());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", name:" + getName() + 
        	", type:" + getType() + 
        	", description:" + getDescription() + 
        "}";
    }
}