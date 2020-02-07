package com.gqk.protoss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class Theme {
    private Integer id;

    private String name;

    private String description;

    @JsonIgnore
    private Integer topicImgId;

    @JsonIgnore
    private Integer deleteTime;

    @JsonIgnore
    private Integer headImgId;

    @JsonIgnore
    private Date updateTime;

}