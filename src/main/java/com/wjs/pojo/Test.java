package com.wjs.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author wjs
 * @create 2022-02-28 14:45
 */
@Data
public class Test implements Serializable {
    private Integer id;
    private String username;
}
