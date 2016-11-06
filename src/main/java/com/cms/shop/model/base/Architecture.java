package com.cms.shop.model.base;

public class Architecture implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer archiId;

    private String archiName;

    public Integer getArchiId() {
        return archiId;
    }

    public void setArchiId(Integer archiId) {
        this.archiId = archiId;
    }

    public String getArchiName() {
        return archiName;
    }

    public void setArchiName(String archiName) {
        this.archiName = archiName == null ? null : archiName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Architecture> T copy(T bean) {
        bean.setArchiId(getArchiId());
        bean.setArchiName(getArchiName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"archiId:" + getArchiId() + 
        	", archiName:" + getArchiName() + 
        "}";
    }
}