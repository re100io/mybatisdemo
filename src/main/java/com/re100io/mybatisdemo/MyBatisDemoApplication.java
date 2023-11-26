package com.re100io.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.re100io.mybatisdemo.mapper")
public class MyBatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisDemoApplication.class, args);
    }

}
