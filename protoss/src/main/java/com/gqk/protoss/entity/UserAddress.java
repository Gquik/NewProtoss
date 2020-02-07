package com.gqk.protoss.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserAddress implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String mobile;

    private String province;

    private String city;

    private String country;

    private String detail;

    private Integer deleteTime;

    private Integer userId;

    private Date updateTime;

    private Integer isDefault;

}