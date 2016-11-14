package com.cms.shop.enums;

import java.math.BigDecimal;

/**
 * @author : samuel
 * @Description :面积区间枚举
 * @Date : 16-10-27
 */
public enum AreaRangeEnum {

    LEVEL1(1,new BigDecimal(500),BigDecimal.ZERO,"大于500㎡"),
    LEVEL2(2,new BigDecimal(400),new BigDecimal(500),"400㎡~500㎡"),
    LEVEL3(3,new BigDecimal(300),new BigDecimal(400),"300㎡~400㎡"),
    LEVEL4(4,new BigDecimal(200),new BigDecimal(300),"200㎡~300㎡"),
    LEVEL5(5,new BigDecimal(150),new BigDecimal(200),"150㎡~200㎡"),
    LEVEL6(6,new BigDecimal(100),new BigDecimal(150),"100㎡~150㎡"),
    LEVEL7(7,new BigDecimal(50),new BigDecimal(100),"50㎡~100㎡"),
    LEVEL8(8,BigDecimal.ZERO,new BigDecimal(50),"50㎡以下");
    private Integer key;

    private BigDecimal minNumber;

    private BigDecimal maxNumber;

    private String description;

    AreaRangeEnum(Integer key, BigDecimal minNumber, BigDecimal maxNumber, String description){
        this.key = key;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.description = description;
    }

    /**
     * 通过key值获取枚举值
     * @param key
     * @return
     */
    public static AreaRangeEnum getEnumByKey(Integer key){
        switch (key){
            case 1:
                return AreaRangeEnum.LEVEL1;
            case 2:
                return AreaRangeEnum.LEVEL2;
            case 3:
                return AreaRangeEnum.LEVEL3;
            case 4:
                return AreaRangeEnum.LEVEL4;
            case 5:
                return AreaRangeEnum.LEVEL5;
            case 6:
                return AreaRangeEnum.LEVEL6;
            case 7:
                return AreaRangeEnum.LEVEL7;
            case 8:
                return AreaRangeEnum.LEVEL8;
            default:
                return null;
        }
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public BigDecimal getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(BigDecimal maxNumber) {
        this.maxNumber = maxNumber;
    }

    public BigDecimal getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(BigDecimal minNumber) {
        this.minNumber = minNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
