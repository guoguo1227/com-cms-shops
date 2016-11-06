package com.cms.shop.model.base;

public class ShopType implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer typeId;

    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends ShopType> T copy(T bean) {
        bean.setTypeId(getTypeId());
        bean.setTypeName(getTypeName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"typeId:" + getTypeId() + 
        	", typeName:" + getTypeName() + 
        "}";
    }
}