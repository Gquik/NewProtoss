package com.gqk.protoss.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderProduct extends OrderProductKey {
    private Integer count;

    private Integer deleteTime;

    private Date updateTime;

}