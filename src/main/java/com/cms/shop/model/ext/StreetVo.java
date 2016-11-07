package com.cms.shop.model.ext;

import com.cms.shop.model.base.Street;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-6
 */
public class StreetVo extends Street {

    private String districtName; //地区名称

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
