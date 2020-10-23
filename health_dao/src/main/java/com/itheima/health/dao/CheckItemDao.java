package com.itheima.health.dao;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemDao {

    /**
     * 查询所有检查项
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 添加检查项
     * @param checkItem
     */
    void add(CheckItem checkItem);

}
