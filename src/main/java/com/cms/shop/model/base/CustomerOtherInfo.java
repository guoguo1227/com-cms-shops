package com.cms.shop.model.base;

import java.util.Date;

public class CustomerOtherInfo implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer custInfoId;

    private Integer gender;

    private String idCard;

    private Integer exprcTag;

    private Integer exprcYears;

    private String otExprc;

    private String remark;

    private Integer rgstCptl;

    private String rgstLoc;

    private Date fndDate;

    private Integer empScal;

    private Integer sbbpf;

    private String scpOfBus;

    private Integer customerId;

    public Integer getCustInfoId() {
        return custInfoId;
    }

    public void setCustInfoId(Integer custInfoId) {
        this.custInfoId = custInfoId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getExprcTag() {
        return exprcTag;
    }

    public void setExprcTag(Integer exprcTag) {
        this.exprcTag = exprcTag;
    }

    public Integer getExprcYears() {
        return exprcYears;
    }

    public void setExprcYears(Integer exprcYears) {
        this.exprcYears = exprcYears;
    }

    public String getOtExprc() {
        return otExprc;
    }

    public void setOtExprc(String otExprc) {
        this.otExprc = otExprc == null ? null : otExprc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRgstCptl() {
        return rgstCptl;
    }

    public void setRgstCptl(Integer rgstCptl) {
        this.rgstCptl = rgstCptl;
    }

    public String getRgstLoc() {
        return rgstLoc;
    }

    public void setRgstLoc(String rgstLoc) {
        this.rgstLoc = rgstLoc == null ? null : rgstLoc.trim();
    }

    public Date getFndDate() {
        return fndDate;
    }

    public void setFndDate(Date fndDate) {
        this.fndDate = fndDate;
    }

    public Integer getEmpScal() {
        return empScal;
    }

    public void setEmpScal(Integer empScal) {
        this.empScal = empScal;
    }

    public Integer getSbbpf() {
        return sbbpf;
    }

    public void setSbbpf(Integer sbbpf) {
        this.sbbpf = sbbpf;
    }

    public String getScpOfBus() {
        return scpOfBus;
    }

    public void setScpOfBus(String scpOfBus) {
        this.scpOfBus = scpOfBus == null ? null : scpOfBus.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends CustomerOtherInfo> T copy(T bean) {
        bean.setCustInfoId(getCustInfoId());
        bean.setGender(getGender());
        bean.setIdCard(getIdCard());
        bean.setExprcTag(getExprcTag());
        bean.setExprcYears(getExprcYears());
        bean.setOtExprc(getOtExprc());
        bean.setRemark(getRemark());
        bean.setRgstCptl(getRgstCptl());
        bean.setRgstLoc(getRgstLoc());
        bean.setFndDate(getFndDate());
        bean.setEmpScal(getEmpScal());
        bean.setSbbpf(getSbbpf());
        bean.setScpOfBus(getScpOfBus());
        bean.setCustomerId(getCustomerId());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"custInfoId:" + getCustInfoId() + 
        	", gender:" + getGender() + 
        	", idCard:" + getIdCard() + 
        	", exprcTag:" + getExprcTag() + 
        	", exprcYears:" + getExprcYears() + 
        	", otExprc:" + getOtExprc() + 
        	", remark:" + getRemark() + 
        	", rgstCptl:" + getRgstCptl() + 
        	", rgstLoc:" + getRgstLoc() + 
        	", fndDate:" + getFndDate() + 
        	", empScal:" + getEmpScal() + 
        	", sbbpf:" + getSbbpf() + 
        	", scpOfBus:" + getScpOfBus() + 
        	", customerId:" + getCustomerId() + 
        "}";
    }
}