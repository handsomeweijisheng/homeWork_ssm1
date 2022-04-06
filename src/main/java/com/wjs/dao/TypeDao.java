package com.wjs.dao;

import com.wjs.pojo.Type;

import java.util.List;

/**
 * @author wjs
 * @create 2022-03-01 16:02
 */
public interface TypeDao {
    /**
     * 查询出所有类型
     * @return
     */
    List<Type> findAll();
}
