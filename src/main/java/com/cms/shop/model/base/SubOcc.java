package com.cms.shop.model.base;

public class SubOcc implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer subOccId;

    private String subOccName;

    private Integer occId;

    public Integer getSubOccId() {
        return subOccId;
    }

    public void setSubOccId(Integer subOccId) {
        this.subOccId = subOccId;
    }

    public String getSubOccName() {
        return subOccName;
    }

    public void setSubOccName(String subOccName) {
        this.subOccName = subOccName == null ? null : subOccName.trim();
    }

    public Integer getOccId() {
        return occId;
    }

    public void setOccId(Integer occId) {
        this.occId = occId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends SubOcc> T copy(T bean) {
        bean.setSubOccId(getSubOccId());
        bean.setSubOccName(getSubOccName());
        bean.setOccId(getOccId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"subOccId:" + getSubOccId() + 
        	", subOccName:" + getSubOccName() + 
        	", occId:" + getOccId() + 
        "}";
    }
}