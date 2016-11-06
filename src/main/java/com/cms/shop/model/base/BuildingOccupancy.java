package com.cms.shop.model.base;

public class BuildingOccupancy implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer ocpyId;

    private String ocpyName;

    public Integer getOcpyId() {
        return ocpyId;
    }

    public void setOcpyId(Integer ocpyId) {
        this.ocpyId = ocpyId;
    }

    public String getOcpyName() {
        return ocpyName;
    }

    public void setOcpyName(String ocpyName) {
        this.ocpyName = ocpyName == null ? null : ocpyName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BuildingOccupancy> T copy(T bean) {
        bean.setOcpyId(getOcpyId());
        bean.setOcpyName(getOcpyName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"ocpyId:" + getOcpyId() + 
        	", ocpyName:" + getOcpyName() + 
        "}";
    }
}