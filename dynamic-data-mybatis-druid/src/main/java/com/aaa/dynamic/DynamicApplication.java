package com.aaa.dynamic;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class DynamicApplication {

    public static void main(String[] args) {
        //jdbc:mysql://47.98.253.2:3306/test1?characterEncoding=utf8&useSSL=false
        SpringApplication.run(DynamicApplication.class, args);
    }

}
