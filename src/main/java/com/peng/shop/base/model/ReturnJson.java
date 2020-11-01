package com.peng.shop.base.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class ReturnJson{

    private String code;
    private Object data;

    public ReturnJson() {
    }

    public ReturnJson(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static ReturnJson build(String code, Object data) {
        return new ReturnJson(code, data);
    }

    public static ReturnJson success(Object data) {
        return new ReturnJson("200", data);
    }

    public static ReturnJson fail(Object data) {
        return new ReturnJson("0", data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
