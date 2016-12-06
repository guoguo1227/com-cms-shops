package com.cms.shop.model.ext;

import com.cms.shop.model.base.Shop;

/**
 * Created by samuel on 16-12-4.
 */
public class ShopExt extends Shop{

    private String img1; //商铺图片1

    private String img2; //商铺图片2

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }
}
