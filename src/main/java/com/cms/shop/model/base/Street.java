package com.cms.shop.model.base;

public class Street implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer streetId;

    private String streetName;

    private Integer districtId;

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Street> T copy(T bean) {
        bean.setStreetId(getStreetId());
        bean.setStreetName(getStreetName());
        bean.setDistrictId(getDistrictId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"streetId:" + getStreetId() + 
        	", streetName:" + getStreetName() + 
        	", districtId:" + getDistrictId() + 
        "}";
    }
}