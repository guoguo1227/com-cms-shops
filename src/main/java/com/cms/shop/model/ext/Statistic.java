package com.cms.shop.model.ext;

/**
 * Created by samuel on 17-1-10.
 */
public class Statistic implements Comparable{

    private String date;

    private String shopClickTotal = "0";

    private String shopFireClick = "0";

    private String shopGoodClick = "0";

    private String adClick = "0";

    private String businessClick = "0";

    private String qqClick = "0";
    private String qaClick = "0";
    private String totoal = "0";

    public String getTotoal() {
        return totoal;
    }

    public void setTotoal(String totoal) {
        this.totoal = totoal;
    }

    public String getQaClick() {
        return qaClick;
    }

    public void setQaClick(String qaClick) {
        this.qaClick = qaClick;
    }

    public String getAdClick() {
        return adClick;
    }

    public void setAdClick(String adClick) {
        this.adClick = adClick;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShopClickTotal() {
        return shopClickTotal;
    }

    public void setShopClickTotal(String shopClickTotal) {
        this.shopClickTotal = shopClickTotal;
    }

    public String getShopFireClick() {
        return shopFireClick;
    }

    public void setShopFireClick(String shopFireClick) {
        this.shopFireClick = shopFireClick;
    }

    public String getShopGoodClick() {
        return shopGoodClick;
    }

    public void setShopGoodClick(String shopGoodClick) {
        this.shopGoodClick = shopGoodClick;
    }

    public String getBusinessClick() {
        return businessClick;
    }

    public void setBusinessClick(String businessClick) {
        this.businessClick = businessClick;
    }

    public String getQqClick() {
        return qqClick;
    }

    public void setQqClick(String qqClick) {
        this.qqClick = qqClick;
    }

    @Override
    public int compareTo(Object o) {
        Statistic s = (Statistic) o;
        return this.date.compareTo(s.date);
    }
}
