package com.cms.shop.model.base;

public class Friend implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer friendId;

    private String friendName;

    private String url;

    private Integer status;

    private Integer editTag;

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName == null ? null : friendName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    public  <T extends Friend> T copy(T bean) {
        bean.setFriendId(getFriendId());
        bean.setFriendName(getFriendName());
        bean.setUrl(getUrl());
        bean.setStatus(getStatus());
        bean.setEditTag(getEditTag());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"friendId:" + getFriendId() + 
        	", friendName:" + getFriendName() + 
        	", url:" + getUrl() + 
        	", status:" + getStatus() + 
        	", editTag:" + getEditTag() + 
        "}";
    }
}