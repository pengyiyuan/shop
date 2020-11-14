package com.peng.shop.business.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.peng.shop.business.goods.dao.GoodsEntityMapper;
import com.peng.shop.business.goods.entity.GoodsEntity;
import com.peng.shop.business.goods.entity.GoodsEntityExample;
import com.peng.shop.business.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsEntityMapper goodsEntityMapper;

    @Override
    public List<GoodsEntity> getGoodsData(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return goodsEntityMapper.selectByExample(new GoodsEntityExample());
    }
}
