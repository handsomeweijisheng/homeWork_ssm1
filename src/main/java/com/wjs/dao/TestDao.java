package com.wjs.dao;

import com.wjs.pojo.Test;

import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 14:41
 */
public interface TestDao {
    List<Test> findAll();
}
