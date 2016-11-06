package com.cms.shop.model.base;

import java.util.Date;

public class Contract implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer contractId;

    private String contractNo;

    private Date startDate;

    private String content;

    private Integer contractStatus;

    private String salesman;

    private Integer shopId;

    private Integer remindPoint;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getRemindPoint() {
        return remindPoint;
    }

    public void setRemindPoint(Integer remindPoint) {
        this.remindPoint = remindPoint;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Contract> T copy(T bean) {
        bean.setContractId(getContractId());
        bean.setContractNo(getContractNo());
        bean.setStartDate(getStartDate());
        bean.setContent(getContent());
        bean.setContractStatus(getContractStatus());
        bean.setSalesman(getSalesman());
        bean.setShopId(getShopId());
        bean.setRemindPoint(getRemindPoint());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"contractId:" + getContractId() + 
        	", contractNo:" + getContractNo() + 
        	", startDate:" + getStartDate() + 
        	", content:" + getContent() + 
        	", contractStatus:" + getContractStatus() + 
        	", salesman:" + getSalesman() + 
        	", shopId:" + getShopId() + 
        	", remindPoint:" + getRemindPoint() + 
        "}";
    }
}