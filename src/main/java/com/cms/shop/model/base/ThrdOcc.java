package com.cms.shop.model.base;

public class ThrdOcc implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer thrdOccId;

    private String thrdOccName;

    private Integer subOccId;

    public Integer getThrdOccId() {
        return thrdOccId;
    }

    public void setThrdOccId(Integer thrdOccId) {
        this.thrdOccId = thrdOccId;
    }

    public String getThrdOccName() {
        return thrdOccName;
    }

    public void setThrdOccName(String thrdOccName) {
        this.thrdOccName = thrdOccName == null ? null : thrdOccName.trim();
    }

    public Integer getSubOccId() {
        return subOccId;
    }

    public void setSubOccId(Integer subOccId) {
        this.subOccId = subOccId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends ThrdOcc> T copy(T bean) {
        bean.setThrdOccId(getThrdOccId());
        bean.setThrdOccName(getThrdOccName());
        bean.setSubOccId(getSubOccId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"thrdOccId:" + getThrdOccId() + 
        	", thrdOccName:" + getThrdOccName() + 
        	", subOccId:" + getSubOccId() + 
        "}";
    }
}