package com.peng.shop.base.model;

import com.github.pagehelper.Page;

import java.util.List;

public class PageInfo<T> {

    /**
     * 当前页面值
     */
    private int pageNum;
    /**
     * 页面显示数量
     */
    private int pageSize;
    /**
     * 实际显示数量
     */
    private int size;
    /**
     * 数据
     */
    private List<T> data;

    public PageInfo() {
    }

    public PageInfo(List<T> data) {
        this.data = data;
        if (data instanceof Page) {
            Page page = (Page)data;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.size = page.size();
        }else{
            this.pageNum = 1;
            this.pageSize = data.size();
            this.size = data.size();
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
