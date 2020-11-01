package com.peng.shop.temp;

import com.peng.shop.base.model.ReturnJson;
import com.peng.shop.base.model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("temp")
public class TempController {

    @GetMapping("test")
    public ReturnJson test() {
        return ReturnJson.success(new TestModel("tom", 123));
    }


}
