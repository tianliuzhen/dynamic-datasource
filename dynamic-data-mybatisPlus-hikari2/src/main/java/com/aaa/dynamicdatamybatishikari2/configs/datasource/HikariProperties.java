package com.aaa.dynamicdatamybatishikari2.configs.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *  连接池设置
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/31
 **/
@Configuration
public class HikariProperties {

    @Value("${spring.datasource.hikari.minimumIdle}")
    private int minIdle;

    @Value("${spring.datasource.hikari.maximumPoolSize}")
    private int maxPoolSize;

    @Value("${spring.datasource.hikari.idleTimeout}")
    private int idleTimeout;

    @Value("${spring.datasource.hikari.maxLifetime}")
    private int maxLifetime;

    @Value("${spring.datasource.hikari.connectionTimeout}")
    private int connectionTimeout;


    public HikariDataSource dataSource(HikariDataSource dataSource) {
        //配置Hikari连接池
        dataSource.setConnectionTimeout(connectionTimeout);//连接超时时间设置
        dataSource.setIdleTimeout(idleTimeout);//连接空闲生命周期设置
        dataSource.setMaximumPoolSize(maxPoolSize);//连接池允许的最大连接数量
        dataSource.setMaxLifetime(maxLifetime);//检查空余连接优化连接池设置时间,单位毫秒
        dataSource.setMinimumIdle(minIdle);//连接池保持最小空余连接数量
        return dataSource;
    }


}
