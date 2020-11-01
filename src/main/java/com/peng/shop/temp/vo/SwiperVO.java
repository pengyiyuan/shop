package com.peng.shop.temp.vo;

public class SwiperVO {

    /**
     * 轮播图地址
     */
    private String imageSrc;
    /**
     * 商品id
     */
    private Integer goodsId;

    public SwiperVO(String imageSrc, Integer goodsId) {
        this.imageSrc = imageSrc;
        this.goodsId = goodsId;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
