package com.peng.shop.base.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class ReturnJson {

    private String code;
    private String msg;
    private Object data;

    public ReturnJson() {
    }

    public ReturnJson(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ReturnJson(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ReturnJson build(String code, String msg, Object data) {
        return new ReturnJson(code, msg, data);
    }

    public static ReturnJson success(Object data) {
        return new ReturnJson("200", "成功", data);
    }

    public static ReturnJson fail(Object data) {
        return new ReturnJson("0", "失败", data);
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
