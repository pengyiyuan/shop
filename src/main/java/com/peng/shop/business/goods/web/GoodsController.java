package com.peng.shop.business.goods.web;

import com.peng.shop.base.model.PageInfo;
import com.peng.shop.base.model.ReturnJson;
import com.peng.shop.business.goods.entity.GoodsEntity;
import com.peng.shop.business.goods.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

@RestController
@RequestMapping("goods")
@Api(tags = "商品")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("getGoodsData")
    @ApiOperation(value = "获取所有商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页数"),
            @ApiImplicitParam(name = "pageSize", value = "页面条数")
    })
    public ReturnJson getGoodsData(@RequestParam @Size(min = 0, max = 32, message = "个数在0-32") int pageNum,
                                   @RequestParam @Size(min = 0, max = 32, message = "个数在0-32") int pageSize) {
        return ReturnJson.success(new PageInfo<GoodsEntity>(goodsService.getGoodsData(pageNum, pageSize)));
    }


}
