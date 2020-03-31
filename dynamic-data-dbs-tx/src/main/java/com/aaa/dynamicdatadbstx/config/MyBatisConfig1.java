package com.aaa.dynamicdatadbstx.config;


import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.mysql.cj.jdbc.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/3/30
 */
@Configuration
// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
@MapperScan(basePackages = "com.aaa.dynamicdatadbstx.dao.test1", sqlSessionFactoryRef = "oneSqlSessionFactory")
public class MyBatisConfig1 {
    @Autowired
    public OneDataSourceProperties oneDataSourceProperties;

    //配置第一个数据源
    @Primary
    @Bean(name = "oneDataSource")
    public DataSource oneDataSource() {
        // 这里datasource要使用阿里的支持XA的DruidXADataSource
        DruidXADataSource datasource = new DruidXADataSource();
        BeanUtils.copyProperties(oneDataSourceProperties,datasource);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(datasource);
        xaDataSource.setUniqueResourceName("oneDataSource");
        return xaDataSource;
    }

    //配置第一个sqlsessionFactory
    @Primary
    @Bean(name = "oneSqlSessionFactory")
    public SqlSessionFactory oneSqlSessionFactory(@Qualifier("oneDataSource") DataSource oneDataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(oneDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(resolver.getResources("classpath:mapping/sid/*.xml"));
        return bean.getObject();
    }
}


