package com.cms.shop.model.base;

public class District implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer districtId;

    private String districtName;

    private Integer priority;

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
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
    public  <T extends District> T copy(T bean) {
        bean.setDistrictId(getDistrictId());
        bean.setDistrictName(getDistrictName());
        bean.setPriority(getPriority());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"districtId:" + getDistrictId() + 
        	", districtName:" + getDistrictName() + 
        	", priority:" + getPriority() + 
        "}";
    }
}