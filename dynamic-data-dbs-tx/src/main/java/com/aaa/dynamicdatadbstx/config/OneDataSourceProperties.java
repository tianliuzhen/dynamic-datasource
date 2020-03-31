package com.aaa.dynamicdatadbstx.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/3/31
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid.db1")
public class OneDataSourceProperties {
    private String driverClassName;

    private String url;

    private String username;

    private String password;

    private Integer initialSize;

    private Integer maxActive;

    private Integer minIdle;
    private Integer maxWait;
    private Integer timeBetweenEvictionRunsMillis;

    private Integer minEvictableIdleTimeMillis;

    private String validationQuery;
    private Boolean testWhileIdle;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;

    private String filters;

}
