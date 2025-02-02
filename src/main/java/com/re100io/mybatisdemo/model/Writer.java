package com.re100io.mybatisdemo.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Writer {
    private Long id;
    private String name;
    private String nationality;
    private Date birthDate;
    private String bio;
    private Date createTime;
    private Date updateTime;
}

