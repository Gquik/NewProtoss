package com.gqk.protoss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class Category {
    private Integer id;

    private String name;

    private Integer topicImgId;

    @JsonIgnore
    private Integer deleteTime;

    private String description;

    @JsonIgnore
    private Date updateTime;

}