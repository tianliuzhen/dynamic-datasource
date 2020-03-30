package com.aaa.dynamicdatadbstx;

import com.aaa.dynamicdatadbstx.config.DBConfig1;
import com.aaa.dynamicdatadbstx.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})

public class DynamicDataDbsTxApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDataDbsTxApplication.class, args);
    }

}
