package com.cms.shop.model.base;

import java.util.Date;

public class Customer implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer customerId;

    private String location;

    private String customerName;

    private Date birthday;

    private String cellphone;

    private String tel;

    private String email;

    private String occ;

    private String linkmanName;

    private String userName;

    private String userPwd;

    private Integer customerStatus;

    private Date registerDate;

    private Integer typeId;

    private Integer editTag;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ == null ? null : occ.trim();
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Integer getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Integer customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getEditTag() {
        return editTag;
    }

    public void setEditTag(Integer editTag) {
        this.editTag = editTag;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Customer> T copy(T bean) {
        bean.setCustomerId(getCustomerId());
        bean.setLocation(getLocation());
        bean.setCustomerName(getCustomerName());
        bean.setBirthday(getBirthday());
        bean.setCellphone(getCellphone());
        bean.setTel(getTel());
        bean.setEmail(getEmail());
        bean.setOcc(getOcc());
        bean.setLinkmanName(getLinkmanName());
        bean.setUserName(getUserName());
        bean.setUserPwd(getUserPwd());
        bean.setCustomerStatus(getCustomerStatus());
        bean.setRegisterDate(getRegisterDate());
        bean.setTypeId(getTypeId());
        bean.setEditTag(getEditTag());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"customerId:" + getCustomerId() + 
        	", location:" + getLocation() + 
        	", customerName:" + getCustomerName() + 
        	", birthday:" + getBirthday() + 
        	", cellphone:" + getCellphone() + 
        	", tel:" + getTel() + 
        	", email:" + getEmail() + 
        	", occ:" + getOcc() + 
        	", linkmanName:" + getLinkmanName() + 
        	", userName:" + getUserName() + 
        	", userPwd:" + getUserPwd() + 
        	", customerStatus:" + getCustomerStatus() + 
        	", registerDate:" + getRegisterDate() + 
        	", typeId:" + getTypeId() + 
        	", editTag:" + getEditTag() + 
        "}";
    }
}