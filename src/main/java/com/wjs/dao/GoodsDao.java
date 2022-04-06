package com.wjs.dao;

import com.wjs.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 15:06
 */
public interface GoodsDao {

    void add(Goods goods);

    Goods selectById(int id);

    Goods selectByIds(@Param("id") Integer id);

    /**
     * 查询所有商品信息
     * @return
     */
    List<Goods> selectAll();
}
