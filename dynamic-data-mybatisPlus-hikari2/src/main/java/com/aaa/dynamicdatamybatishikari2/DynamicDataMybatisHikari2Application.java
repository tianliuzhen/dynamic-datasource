package com.aaa.dynamicdatamybatishikari2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DynamicDataMybatisHikari2Application {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDataMybatisHikari2Application.class, args);
    }

}
