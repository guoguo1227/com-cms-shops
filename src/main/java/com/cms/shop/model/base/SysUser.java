package com.cms.shop.model.base;

public class SysUser implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer auditLevel;

    private String infoName;

    private String userMail;

    private Integer proposalLevel;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(Integer auditLevel) {
        this.auditLevel = auditLevel;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName == null ? null : infoName.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    public Integer getProposalLevel() {
        return proposalLevel;
    }

    public void setProposalLevel(Integer proposalLevel) {
        this.proposalLevel = proposalLevel;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends SysUser> T copy(T bean) {
        bean.setUserId(getUserId());
        bean.setUserName(getUserName());
        bean.setUserPwd(getUserPwd());
        bean.setAuditLevel(getAuditLevel());
        bean.setInfoName(getInfoName());
        bean.setUserMail(getUserMail());
        bean.setProposalLevel(getProposalLevel());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"userId:" + getUserId() + 
        	", userName:" + getUserName() + 
        	", userPwd:" + getUserPwd() + 
        	", auditLevel:" + getAuditLevel() + 
        	", infoName:" + getInfoName() + 
        	", userMail:" + getUserMail() + 
        	", proposalLevel:" + getProposalLevel() + 
        "}";
    }
}