package com.cms.shop.model.ext;

/**
 * @author : samuel
 * @Description :留言实体对象
 * @Date : 16-11-10
 */
public class CommentVo {

    private String company;

    private String address;

    private String phone;

    private String email;

    private String content;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
