package com.re100io.mybatisdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Work {
    private Long id;
    private String title;
    private Date publicationDate;
    private String genre;
    private Date createTime;
    private Date updateTime;
}
