package com.cms.shop.model.base;

import java.util.Date;

public class Keyword implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String word;

    private Integer count;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Keyword> T copy(T bean) {
        bean.setId(getId());
        bean.setWord(getWord());
        bean.setCount(getCount());
        bean.setCreatetime(getCreatetime());
        bean.setUpdatetime(getUpdatetime());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", word:" + getWord() + 
        	", count:" + getCount() + 
        	", createtime:" + getCreatetime() + 
        	", updatetime:" + getUpdatetime() + 
        "}";
    }
}