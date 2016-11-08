package com.cms.shop.enums;

/**
 * @author : samuel
 * @Description :图片类型枚举
 * @Date : 16-11-8
 */
public enum  ImageType {
    ADVERT(ImageTypeConstants.ADVERT_CODE,"/upload/advert/"),
    BOARD(ImageTypeConstants.BOARD_CODE,"/upload/board/"),
    BUSINESS(ImageTypeConstants.BUSINESS_CODE,"/upload/business/"),
    CONTRACT(ImageTypeConstants.CONTRACT_CODE,"/upload/contract/"),
    CUSTOMER(ImageTypeConstants.CUSTOMER_CODE,"/upload/customer/"),
    PARTNER(ImageTypeConstants.PARTNER_CODE,"/upload/partner/"),
    SHOPPIC(ImageTypeConstants.SHOPPIC_CODE,"/upload/shopPic/"),
    FLASH(ImageTypeConstants.FLASH_CODE,"/flash/");

    Integer code;
    String imagePath;

    public static String getImagePath(int code){
        switch (code){
            case 1:
                return ADVERT.getImagePath();
            case 2:
                return BOARD.getImagePath();
            case 3:
                return BUSINESS.getImagePath();
            case 4:
                return CONTRACT.getImagePath();
            case 5:
                return CUSTOMER.getImagePath();
            case 6:
                return PARTNER.getImagePath();
            case 7:
                return SHOPPIC.getImagePath();
            case 8:
                return ADVERT.getImagePath();
            case 9:
                return FLASH.getImagePath();
            default:
                return "upload";
        }
    }

    ImageType(Integer code, String imagePath){
        this.code = code;
        this.imagePath = imagePath;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    final static class ImageTypeConstants{

        public static final Integer ADVERT_CODE = 1; //图片上传路径
        public static final Integer BOARD_CODE = 2; //图片上传路径
        public static final Integer BUSINESS_CODE = 3; //图片上传路径
        public static final Integer CONTRACT_CODE = 4; //图片上传路径
        public static final Integer CUSTOMER_CODE = 5; //图片上传路径
        public static final Integer PARTNER_CODE = 6; //图片上传路径
        public static final Integer SHOPPIC_CODE = 7; //图片上传路径
        public static final Integer FLASH_CODE = 8; //图片上传路径

    }
}
