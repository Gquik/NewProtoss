package com.gqk.protoss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class Image {
    @JsonIgnore
    private Integer id;

    private String url;

    @JsonIgnore
    private Byte from;

    @JsonIgnore
    private Integer deleteTime;

    @JsonIgnore
    private Date updateTime;

}