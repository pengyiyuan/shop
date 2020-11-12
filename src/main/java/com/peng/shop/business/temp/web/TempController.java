package com.peng.shop.business.temp.web;

import com.github.pagehelper.PageHelper;
import com.peng.shop.base.constant.Constant;
import com.peng.shop.base.model.PageInfo;
import com.peng.shop.base.model.ReturnJson;
import com.peng.shop.business.temp.dao.TempEntityMapper;
import com.peng.shop.business.temp.entity.TempEntity;
import com.peng.shop.business.temp.entity.TempEntityExample;
import com.peng.shop.business.temp.model.SwiperVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("temp")
public class TempController {

    @Autowired
    TempEntityMapper mapper;

    @GetMapping("test")
    public ReturnJson test() {
        PageHelper.startPage(3,2);
        List<TempEntity> tempEntities = mapper.selectByExample(new TempEntityExample());
        return ReturnJson.success(new PageInfo<TempEntity>(tempEntities));
    }

    @GetMapping("index/getSwiperData")
    public ReturnJson getSwiperData() {
        List<SwiperVO> swiperVOList = new ArrayList<>();
        swiperVOList.add(new SwiperVO(Constant.BaseConfig.SERVER_IP + "/shop/cb6410526aca76058b3cc83ebcc38fd9.jpg", 1));
        swiperVOList.add(new SwiperVO(Constant.BaseConfig.SERVER_IP + "/shop/0ed363a7a4cb909b1c3c84f792b5d01f.png", 2));
        swiperVOList.add(new SwiperVO(Constant.BaseConfig.SERVER_IP + "/shop/5156a02acde786e2c5f3243c37701d7c.jpg", 3));
        return ReturnJson.success(swiperVOList);
    }


}
