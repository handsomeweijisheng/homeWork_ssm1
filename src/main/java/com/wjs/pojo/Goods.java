package com.wjs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wjs
 * @create 2022-02-28 14:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
    private Integer goodsId;
    private String  goodsName;
    private String  goodsPrice;
    private String  goodsPhoto;
    private String typeId;

    public Goods(String goodsName, String goodsPrice, String goodsPhoto, String typeId) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsPhoto = goodsPhoto;
        this.typeId = typeId;
    }
}
