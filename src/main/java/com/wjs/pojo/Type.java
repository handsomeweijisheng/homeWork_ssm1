package com.wjs.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wjs
 * @create 2022-02-28 14:58
 */
@Data
public class Type implements Serializable {
    private Integer typeId;
    private String  typeName;
}
