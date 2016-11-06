package com.cms.shop.model.base;

public class CustomerType implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer custTypeId;

    private String typeName;

    public Integer getCustTypeId() {
        return custTypeId;
    }

    public void setCustTypeId(Integer custTypeId) {
        this.custTypeId = custTypeId;
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
    public  <T extends CustomerType> T copy(T bean) {
        bean.setCustTypeId(getCustTypeId());
        bean.setTypeName(getTypeName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"custTypeId:" + getCustTypeId() + 
        	", typeName:" + getTypeName() + 
        "}";
    }
}