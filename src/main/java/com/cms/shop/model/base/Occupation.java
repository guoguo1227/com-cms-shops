package com.cms.shop.model.base;

public class Occupation implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer occId;

    private String occName;

    public Integer getOccId() {
        return occId;
    }

    public void setOccId(Integer occId) {
        this.occId = occId;
    }

    public String getOccName() {
        return occName;
    }

    public void setOccName(String occName) {
        this.occName = occName == null ? null : occName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Occupation> T copy(T bean) {
        bean.setOccId(getOccId());
        bean.setOccName(getOccName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"occId:" + getOccId() + 
        	", occName:" + getOccName() + 
        "}";
    }
}