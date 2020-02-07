package com.gqk.protoss.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ThirdApp {
    private Integer id;

    private String appId;

    private String appSecret;

    private String appDescription;

    private String scope;

    private String scopeDescription;

    private Integer deleteTime;

    private Date updateTime;
    
}