package com.wjs.service;

import com.wjs.pojo.Goods;

import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 15:04
 */
public interface GoodsService {

    void add(Goods goods);

    Goods selectById(int id);

    /**
     * 查询所有的商品
     * @return
     */
    List<Goods> findAll();
}
