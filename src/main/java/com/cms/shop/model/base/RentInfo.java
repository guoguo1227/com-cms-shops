package com.cms.shop.model.base;

public class RentInfo implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer rentInfoId;

    private Integer square;

    private Integer floor;

    private Integer price;

    private String facil;

    private String distName;

    public Integer getRentInfoId() {
        return rentInfoId;
    }

    public void setRentInfoId(Integer rentInfoId) {
        this.rentInfoId = rentInfoId;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFacil() {
        return facil;
    }

    public void setFacil(String facil) {
        this.facil = facil == null ? null : facil.trim();
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName == null ? null : distName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends RentInfo> T copy(T bean) {
        bean.setRentInfoId(getRentInfoId());
        bean.setSquare(getSquare());
        bean.setFloor(getFloor());
        bean.setPrice(getPrice());
        bean.setFacil(getFacil());
        bean.setDistName(getDistName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"rentInfoId:" + getRentInfoId() + 
        	", square:" + getSquare() + 
        	", floor:" + getFloor() + 
        	", price:" + getPrice() + 
        	", facil:" + getFacil() + 
        	", distName:" + getDistName() + 
        "}";
    }
}