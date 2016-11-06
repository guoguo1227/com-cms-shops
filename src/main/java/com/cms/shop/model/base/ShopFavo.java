package com.cms.shop.model.base;

import java.util.Date;

public class ShopFavo implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer favoId;

    private Integer shopId;

    private String shopName;

    private String distName;

    private Date addDate;

    private Integer custId;

    private Integer shopStatus;

    public Integer getFavoId() {
        return favoId;
    }

    public void setFavoId(Integer favoId) {
        this.favoId = favoId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName == null ? null : distName.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends ShopFavo> T copy(T bean) {
        bean.setFavoId(getFavoId());
        bean.setShopId(getShopId());
        bean.setShopName(getShopName());
        bean.setDistName(getDistName());
        bean.setAddDate(getAddDate());
        bean.setCustId(getCustId());
        bean.setShopStatus(getShopStatus());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"favoId:" + getFavoId() + 
        	", shopId:" + getShopId() + 
        	", shopName:" + getShopName() + 
        	", distName:" + getDistName() + 
        	", addDate:" + getAddDate() + 
        	", custId:" + getCustId() + 
        	", shopStatus:" + getShopStatus() + 
        "}";
    }
}