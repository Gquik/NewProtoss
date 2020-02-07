package com.gqk.protoss.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String openid;

    private String nickname;

    private String extend;

    private Integer deleteTime;

    private Date createTime;

    private Date updateTime;

}