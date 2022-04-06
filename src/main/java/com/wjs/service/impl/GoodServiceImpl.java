package com.wjs.service.impl;

import com.wjs.dao.GoodsDao;
import com.wjs.pojo.Goods;
import com.wjs.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 15:05
 */
@Service
public class GoodServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public void add(Goods goods) {
        goodsDao.add(goods);
    }

    @Override
    public Goods selectById(int id) {
        return goodsDao.selectById(id);
    }

    @Override
    public List<Goods> findAll() {
        return goodsDao.selectAll();
    }
}
