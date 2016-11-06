package com.cms.shop.model.base;

public class BuildingFinishing implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer finishingId;

    private String finishingName;

    public Integer getFinishingId() {
        return finishingId;
    }

    public void setFinishingId(Integer finishingId) {
        this.finishingId = finishingId;
    }

    public String getFinishingName() {
        return finishingName;
    }

    public void setFinishingName(String finishingName) {
        this.finishingName = finishingName == null ? null : finishingName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BuildingFinishing> T copy(T bean) {
        bean.setFinishingId(getFinishingId());
        bean.setFinishingName(getFinishingName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"finishingId:" + getFinishingId() + 
        	", finishingName:" + getFinishingName() + 
        "}";
    }
}