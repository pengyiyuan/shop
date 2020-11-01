package com.peng.shop.temp.web;

import com.peng.shop.base.model.ReturnJson;
import com.peng.shop.base.model.TestModel;
import com.peng.shop.temp.vo.SwiperVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("temp")
public class TempController {

    @GetMapping("test")
    public ReturnJson test() {
        return ReturnJson.success(new TestModel("tom", 123));
    }

    @GetMapping("index/getSwiperData")
    public ReturnJson getSwiperData() {
        List<SwiperVO> swiperVOList = new ArrayList<>();
        swiperVOList.add(new SwiperVO("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1604235615&di=d64c4653eddef00e701a4d73ade14d79&src=http://a0.att.hudong.com/18/56/14300000958002128488569856508.jpg", 1));
        swiperVOList.add(new SwiperVO("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604245710235&di=09ea84205af09b12f3c35369972f33d7&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg", 2));
        swiperVOList.add(new SwiperVO("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604245710233&di=04478c3e3f6d734a00ff7b23040561c3&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F25%2F99%2F19300000421423134190997943822.jpghttps://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604245710233&di=04478c3e3f6d734a00ff7b23040561c3&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F25%2F99%2F19300000421423134190997943822.jpg", 3));
        return ReturnJson.success(swiperVOList);
    }
}
