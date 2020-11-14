package com.peng.shop.business.goods.service;

import com.peng.shop.business.goods.entity.GoodsEntity;

import java.util.List;

public interface GoodsService {

    List<GoodsEntity> getGoodsData(int pageNum, int pageSize);
}
