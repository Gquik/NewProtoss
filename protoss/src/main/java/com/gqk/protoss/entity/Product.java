package com.gqk.protoss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Product {
    private Integer id;

    private String name;

    private BigDecimal price;

    private Integer stock;

    @JsonIgnore
    private Integer deleteTime;

    @JsonIgnore
    private Integer categoryId;

    private String mainImgUrl;

    @JsonIgnore
    private Byte from;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    private String summary;

    private Integer imgId;

}