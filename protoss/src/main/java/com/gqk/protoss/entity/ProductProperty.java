package com.gqk.protoss.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ProductProperty {
    private Integer id;

    private String name;

    private String detail;

    private Integer productId;

    private Integer deleteTime;

    private Date updateTime;

}