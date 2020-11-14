package com.peng.shop.business.goods.model;

public enum GoodsType {
    SWAPPER(1, "轮播商品"),
    HOT(2, "热门商品"),
    ;

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    GoodsType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

//    public static GoodsType getGoodsType(int code) {
//        for (GoodsType type : GoodsType.values()) {
//            if (type.code == code) {
//                return type;
//            }
//        }
//        return null;
//    }
}
