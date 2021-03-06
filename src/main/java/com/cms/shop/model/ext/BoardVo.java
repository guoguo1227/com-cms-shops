package com.cms.shop.model.ext;

import com.cms.shop.model.base.Board;

/**
 * @author : samuel
 * @Description : 公告rest层对象
 * @Date : 16-11-7
 */
public class BoardVo extends Board{

    private String userName ; //用户名称

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
