package com.gqk.protoss.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private Integer id;

    private String orderNo;

    private Integer userId;

    private Integer deleteTime;

    private Date createTime;

    private BigDecimal totalPrice;

    private Integer status;

    private String snapImg;

    private String snapName;

    private Integer totalCount;

    private Date updateTime;

    private String snapAddress;

    private String prepayId;

    private String snapItems;

}