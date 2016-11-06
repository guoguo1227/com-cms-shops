package com.cms.shop.model.base;

import java.util.Date;

public class BizReportData implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String yeMon;

    private Integer custNum;

    private Integer shopNum;

    private Integer rentNum;

    private Integer rentScNum;

    private Integer infoNum;

    private Date dataTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYeMon() {
        return yeMon;
    }

    public void setYeMon(String yeMon) {
        this.yeMon = yeMon == null ? null : yeMon.trim();
    }

    public Integer getCustNum() {
        return custNum;
    }

    public void setCustNum(Integer custNum) {
        this.custNum = custNum;
    }

    public Integer getShopNum() {
        return shopNum;
    }

    public void setShopNum(Integer shopNum) {
        this.shopNum = shopNum;
    }

    public Integer getRentNum() {
        return rentNum;
    }

    public void setRentNum(Integer rentNum) {
        this.rentNum = rentNum;
    }

    public Integer getRentScNum() {
        return rentScNum;
    }

    public void setRentScNum(Integer rentScNum) {
        this.rentScNum = rentScNum;
    }

    public Integer getInfoNum() {
        return infoNum;
    }

    public void setInfoNum(Integer infoNum) {
        this.infoNum = infoNum;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends BizReportData> T copy(T bean) {
        bean.setId(getId());
        bean.setYeMon(getYeMon());
        bean.setCustNum(getCustNum());
        bean.setShopNum(getShopNum());
        bean.setRentNum(getRentNum());
        bean.setRentScNum(getRentScNum());
        bean.setInfoNum(getInfoNum());
        bean.setDataTime(getDataTime());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", yeMon:" + getYeMon() + 
        	", custNum:" + getCustNum() + 
        	", shopNum:" + getShopNum() + 
        	", rentNum:" + getRentNum() + 
        	", rentScNum:" + getRentScNum() + 
        	", infoNum:" + getInfoNum() + 
        	", dataTime:" + getDataTime() + 
        "}";
    }
}