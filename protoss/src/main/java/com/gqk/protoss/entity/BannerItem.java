package com.gqk.protoss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class BannerItem {
    @JsonIgnore
    private Integer id;

    @JsonIgnore
    private Integer imgId;

    private String keyWord;

    private Byte type;

    @JsonIgnore
    private Integer deleteTime;

    @JsonIgnore
    private Integer bannerId;

    @JsonIgnore
    private Date updateTime;

}