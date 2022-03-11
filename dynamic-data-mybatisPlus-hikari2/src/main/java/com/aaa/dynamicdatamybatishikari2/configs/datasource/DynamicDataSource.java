package com.aaa.dynamicdatamybatishikari2.configs.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * 动态数据源
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/31
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {


    public DynamicDataSource(DataSource defaultTargetDataSource, Map<Object, Object> targetDataSources) {
        super.setDefaultTargetDataSource(defaultTargetDataSource);
        super.setTargetDataSources(targetDataSources);
        super.afterPropertiesSet();
    }

    // 此方法 匹配数据源
    // @Override
    // protected DataSource determineTargetDataSource() {
    //     return super.determineTargetDataSource();
    // }

    /**
     * 这里用到了我们需要进行实现的抽象方法determineCurrentLookupKey()，
     * 该方法返回需要使用的DataSource的key值，
     * 然后根据这个key从resolvedDataSources这个map里取出对应的DataSource，
     * 如果找不到，则用默认的resolvedDefaultDataSource。
     *
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineTargetDataSource()
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
