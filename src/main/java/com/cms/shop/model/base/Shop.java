package com.cms.shop.model.base;

import java.math.BigDecimal;
import java.util.Date;

public class Shop implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String shopName;

    private String shopNo;

    private String location;

    private String description;

    private String floor;

    private BigDecimal squareMetres;

    private String traffic;

    private String facility;

    private Integer monthDeposit;

    private String price;

    private String priceSe;

    private Date createDate;

    private Date removeDate;

    private Date onsellDate;

    private Date offsellDate;

    private Integer auditLevel;

    private Integer auditStatus;

    private Integer editTag;

    private Integer shopStatus;

    private Integer districtId;

    private Integer archiId;

    private Integer ocpyId;

    private String linkmanName;

    private String linkmanPhone;

    private String linkmanEmail;

    private String linkmanMobile;

    private String linkmanNameSe;

    private String linkmanPhoneSe;

    private String linkmanEmailSe;

    private String linkmanMobileSe;

    private Integer typeId;

    private Integer finishingId;

    private Integer priceType;

    private String publisher;

    private Integer streetId;

    private Integer hotId;

    private Integer browsers;

    private BigDecimal lng;

    private BigDecimal lat;

    private Integer zoom;

    private Integer flrheight;

    private BigDecimal officeSquare;

    private BigDecimal factorySquare;

    private BigDecimal warehouseSquare;

    private BigDecimal yardSquare;

    private BigDecimal shopSquare;

    private Integer rentType;

    private Integer ontop;

    private Integer depositType;

    private Integer price2;

    private Integer priceSe2;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public BigDecimal getSquareMetres() {
        return squareMetres;
    }

    public void setSquareMetres(BigDecimal squareMetres) {
        this.squareMetres = squareMetres;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility == null ? null : facility.trim();
    }

    public Integer getMonthDeposit() {
        return monthDeposit;
    }

    public void setMonthDeposit(Integer monthDeposit) {
        this.monthDeposit = monthDeposit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPriceSe() {
        return priceSe;
    }

    public void setPriceSe(String priceSe) {
        this.priceSe = priceSe == null ? null : priceSe.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }

    public Date getOnsellDate() {
        return onsellDate;
    }

    public void setOnsellDate(Date onsellDate) {
        this.onsellDate = onsellDate;
    }

    public Date getOffsellDate() {
        return offsellDate;
    }

    public void setOffsellDate(Date offsellDate) {
        this.offsellDate = offsellDate;
    }

    public Integer getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(Integer auditLevel) {
        this.auditLevel = auditLevel;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getArchiId() {
        return archiId;
    }

    public void setArchiId(Integer archiId) {
        this.archiId = archiId;
    }

    public Integer getOcpyId() {
        return ocpyId;
    }

    public void setOcpyId(Integer ocpyId) {
        this.ocpyId = ocpyId;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    public String getLinkmanNameSe() {
        return linkmanNameSe;
    }

    public void setLinkmanNameSe(String linkmanNameSe) {
        this.linkmanNameSe = linkmanNameSe == null ? null : linkmanNameSe.trim();
    }

    public String getLinkmanPhoneSe() {
        return linkmanPhoneSe;
    }

    public void setLinkmanPhoneSe(String linkmanPhoneSe) {
        this.linkmanPhoneSe = linkmanPhoneSe == null ? null : linkmanPhoneSe.trim();
    }

    public String getLinkmanEmailSe() {
        return linkmanEmailSe;
    }

    public void setLinkmanEmailSe(String linkmanEmailSe) {
        this.linkmanEmailSe = linkmanEmailSe == null ? null : linkmanEmailSe.trim();
    }

    public String getLinkmanMobileSe() {
        return linkmanMobileSe;
    }

    public void setLinkmanMobileSe(String linkmanMobileSe) {
        this.linkmanMobileSe = linkmanMobileSe == null ? null : linkmanMobileSe.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getFinishingId() {
        return finishingId;
    }

    public void setFinishingId(Integer finishingId) {
        this.finishingId = finishingId;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public Integer getHotId() {
        return hotId;
    }

    public void setHotId(Integer hotId) {
        this.hotId = hotId;
    }

    public Integer getBrowsers() {
        return browsers;
    }

    public void setBrowsers(Integer browsers) {
        this.browsers = browsers;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public Integer getFlrheight() {
        return flrheight;
    }

    public void setFlrheight(Integer flrheight) {
        this.flrheight = flrheight;
    }

    public BigDecimal getOfficeSquare() {
        return officeSquare;
    }

    public void setOfficeSquare(BigDecimal officeSquare) {
        this.officeSquare = officeSquare;
    }

    public BigDecimal getFactorySquare() {
        return factorySquare;
    }

    public void setFactorySquare(BigDecimal factorySquare) {
        this.factorySquare = factorySquare;
    }

    public BigDecimal getWarehouseSquare() {
        return warehouseSquare;
    }

    public void setWarehouseSquare(BigDecimal warehouseSquare) {
        this.warehouseSquare = warehouseSquare;
    }

    public BigDecimal getYardSquare() {
        return yardSquare;
    }

    public void setYardSquare(BigDecimal yardSquare) {
        this.yardSquare = yardSquare;
    }

    public BigDecimal getShopSquare() {
        return shopSquare;
    }

    public void setShopSquare(BigDecimal shopSquare) {
        this.shopSquare = shopSquare;
    }

    public Integer getRentType() {
        return rentType;
    }

    public void setRentType(Integer rentType) {
        this.rentType = rentType;
    }

    public Integer getOntop() {
        return ontop;
    }

    public void setOntop(Integer ontop) {
        this.ontop = ontop;
    }

    public Integer getDepositType() {
        return depositType;
    }

    public void setDepositType(Integer depositType) {
        this.depositType = depositType;
    }

    public Integer getPrice2() {
        return price2;
    }

    public void setPrice2(Integer price2) {
        this.price2 = price2;
    }

    public Integer getPriceSe2() {
        return priceSe2;
    }

    public void setPriceSe2(Integer priceSe2) {
        this.priceSe2 = priceSe2;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Shop> T copy(T bean) {
        bean.setId(getId());
        bean.setShopName(getShopName());
        bean.setShopNo(getShopNo());
        bean.setLocation(getLocation());
        bean.setDescription(getDescription());
        bean.setFloor(getFloor());
        bean.setSquareMetres(getSquareMetres());
        bean.setTraffic(getTraffic());
        bean.setFacility(getFacility());
        bean.setMonthDeposit(getMonthDeposit());
        bean.setPrice(getPrice());
        bean.setPriceSe(getPriceSe());
        bean.setCreateDate(getCreateDate());
        bean.setRemoveDate(getRemoveDate());
        bean.setOnsellDate(getOnsellDate());
        bean.setOffsellDate(getOffsellDate());
        bean.setAuditLevel(getAuditLevel());
        bean.setAuditStatus(getAuditStatus());
        bean.setEditTag(getEditTag());
        bean.setShopStatus(getShopStatus());
        bean.setDistrictId(getDistrictId());
        bean.setArchiId(getArchiId());
        bean.setOcpyId(getOcpyId());
        bean.setLinkmanName(getLinkmanName());
        bean.setLinkmanPhone(getLinkmanPhone());
        bean.setLinkmanEmail(getLinkmanEmail());
        bean.setLinkmanMobile(getLinkmanMobile());
        bean.setLinkmanNameSe(getLinkmanNameSe());
        bean.setLinkmanPhoneSe(getLinkmanPhoneSe());
        bean.setLinkmanEmailSe(getLinkmanEmailSe());
        bean.setLinkmanMobileSe(getLinkmanMobileSe());
        bean.setTypeId(getTypeId());
        bean.setFinishingId(getFinishingId());
        bean.setPriceType(getPriceType());
        bean.setPublisher(getPublisher());
        bean.setStreetId(getStreetId());
        bean.setHotId(getHotId());
        bean.setBrowsers(getBrowsers());
        bean.setLng(getLng());
        bean.setLat(getLat());
        bean.setZoom(getZoom());
        bean.setFlrheight(getFlrheight());
        bean.setOfficeSquare(getOfficeSquare());
        bean.setFactorySquare(getFactorySquare());
        bean.setWarehouseSquare(getWarehouseSquare());
        bean.setYardSquare(getYardSquare());
        bean.setShopSquare(getShopSquare());
        bean.setRentType(getRentType());
        bean.setOntop(getOntop());
        bean.setDepositType(getDepositType());
        bean.setPrice2(getPrice2());
        bean.setPriceSe2(getPriceSe2());
        bean.setType(getType());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", shopName:" + getShopName() + 
        	", shopNo:" + getShopNo() + 
        	", location:" + getLocation() + 
        	", description:" + getDescription() + 
        	", floor:" + getFloor() + 
        	", squareMetres:" + getSquareMetres() + 
        	", traffic:" + getTraffic() + 
        	", facility:" + getFacility() + 
        	", monthDeposit:" + getMonthDeposit() + 
        	", price:" + getPrice() + 
        	", priceSe:" + getPriceSe() + 
        	", createDate:" + getCreateDate() + 
        	", removeDate:" + getRemoveDate() + 
        	", onsellDate:" + getOnsellDate() + 
        	", offsellDate:" + getOffsellDate() + 
        	", auditLevel:" + getAuditLevel() + 
        	", auditStatus:" + getAuditStatus() + 
        	", editTag:" + getEditTag() + 
        	", shopStatus:" + getShopStatus() + 
        	", districtId:" + getDistrictId() + 
        	", archiId:" + getArchiId() + 
        	", ocpyId:" + getOcpyId() + 
        	", linkmanName:" + getLinkmanName() + 
        	", linkmanPhone:" + getLinkmanPhone() + 
        	", linkmanEmail:" + getLinkmanEmail() + 
        	", linkmanMobile:" + getLinkmanMobile() + 
        	", linkmanNameSe:" + getLinkmanNameSe() + 
        	", linkmanPhoneSe:" + getLinkmanPhoneSe() + 
        	", linkmanEmailSe:" + getLinkmanEmailSe() + 
        	", linkmanMobileSe:" + getLinkmanMobileSe() + 
        	", typeId:" + getTypeId() + 
        	", finishingId:" + getFinishingId() + 
        	", priceType:" + getPriceType() + 
        	", publisher:" + getPublisher() + 
        	", streetId:" + getStreetId() + 
        	", hotId:" + getHotId() + 
        	", browsers:" + getBrowsers() + 
        	", lng:" + getLng() + 
        	", lat:" + getLat() + 
        	", zoom:" + getZoom() + 
        	", flrheight:" + getFlrheight() + 
        	", officeSquare:" + getOfficeSquare() + 
        	", factorySquare:" + getFactorySquare() + 
        	", warehouseSquare:" + getWarehouseSquare() + 
        	", yardSquare:" + getYardSquare() + 
        	", shopSquare:" + getShopSquare() + 
        	", rentType:" + getRentType() + 
        	", ontop:" + getOntop() + 
        	", depositType:" + getDepositType() + 
        	", price2:" + getPrice2() + 
        	", priceSe2:" + getPriceSe2() + 
        	", type:" + getType() + 
        "}";
    }
}