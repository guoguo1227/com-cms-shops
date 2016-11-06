package com.cms.shop.model.base;

public class ShopImg implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer imgId;

    private String newImgName;

    private String oldImgName;

    private Integer shopId;

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getNewImgName() {
        return newImgName;
    }

    public void setNewImgName(String newImgName) {
        this.newImgName = newImgName == null ? null : newImgName.trim();
    }

    public String getOldImgName() {
        return oldImgName;
    }

    public void setOldImgName(String oldImgName) {
        this.oldImgName = oldImgName == null ? null : oldImgName.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends ShopImg> T copy(T bean) {
        bean.setImgId(getImgId());
        bean.setNewImgName(getNewImgName());
        bean.setOldImgName(getOldImgName());
        bean.setShopId(getShopId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"imgId:" + getImgId() + 
        	", newImgName:" + getNewImgName() + 
        	", oldImgName:" + getOldImgName() + 
        	", shopId:" + getShopId() + 
        "}";
    }
}