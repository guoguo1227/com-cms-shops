package com.cms.shop.model.base;

public class BuildingFacility implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer facilId;

    private String facilName;

    public Integer getFacilId() {
        return facilId;
    }

    public void setFacilId(Integer facilId) {
        this.facilId = facilId;
    }

    public String getFacilName() {
        return facilName;
    }

    public void setFacilName(String facilName) {
        this.facilName = facilName == null ? null : facilName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BuildingFacility> T copy(T bean) {
        bean.setFacilId(getFacilId());
        bean.setFacilName(getFacilName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"facilId:" + getFacilId() + 
        	", facilName:" + getFacilName() + 
        "}";
    }
}