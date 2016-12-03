package com.cms.shop.model.ext;

import com.cms.shop.model.base.Qa;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-12-3
 */
public class QaVo{

    private Qa qa ;

    private String shopName; //商铺名称

    private String distruct; //所属地区

    public String getDistruct() {
        return distruct;
    }

    public void setDistruct(String distruct) {
        this.distruct = distruct;
    }

    public String getShopName() {
        return shopName;
    }

    public Qa getQa() {
        return qa;
    }

    public void setQa(Qa qa) {
        this.qa = qa;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
