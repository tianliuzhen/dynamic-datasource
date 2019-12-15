package com.aaa.dynamic_data_mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DynamicDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDataMybatisApplication.class, args);
    }

}
