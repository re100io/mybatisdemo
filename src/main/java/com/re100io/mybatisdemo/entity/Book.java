package com.re100io.mybatisdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private Double price;
}
