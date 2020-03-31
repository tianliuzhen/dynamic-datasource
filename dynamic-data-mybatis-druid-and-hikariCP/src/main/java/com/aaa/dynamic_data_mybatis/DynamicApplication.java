package com.aaa.dynamic_data_mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 参考苞米官网：https://gitee.com/baomidou/dynamic-datasource-spring-boot-starter/wikis/pages?sort_id=1030570&doc_id=147063
 *
 * 如果不配置连接池type类型，默认是 Druid优先于HikariCP 。
 * 若要切换   Druid
 * 1、修改  @SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
 * 2、取消注释  依赖（druid-spring-boot-starter ）
 * @author 信息
 */
//@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@SpringBootApplication
public class DynamicApplication {

    public static void main(String[] args) {
        //jdbc:mysql://47.98.253.2:3306/test1?characterEncoding=utf8&useSSL=false
        SpringApplication.run(DynamicApplication.class, args);
    }

}
