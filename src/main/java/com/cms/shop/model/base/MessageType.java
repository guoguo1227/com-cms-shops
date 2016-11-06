package com.cms.shop.model.base;

public class MessageType implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer msgTypeId;

    private String typeName;

    public Integer getMsgTypeId() {
        return msgTypeId;
    }

    public void setMsgTypeId(Integer msgTypeId) {
        this.msgTypeId = msgTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends MessageType> T copy(T bean) {
        bean.setMsgTypeId(getMsgTypeId());
        bean.setTypeName(getTypeName());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"msgTypeId:" + getMsgTypeId() + 
        	", typeName:" + getTypeName() + 
        "}";
    }
}