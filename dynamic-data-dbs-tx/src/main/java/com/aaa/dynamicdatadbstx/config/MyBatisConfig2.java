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

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/3/31
 */
@Configuration
// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
@MapperScan(basePackages = "com.aaa.dynamicdatadbstx.dao.test2", sqlSessionFactoryRef = "twoSqlSessionFactory")
public class MyBatisConfig2 {
    @Autowired
    public TwoDataSourceProperties twoDataSourceProperties;

    @Bean(name = "twoDataSource")
    public DataSource twoDataSource() {
        DruidXADataSource datasource = new DruidXADataSource();
        BeanUtils.copyProperties(twoDataSourceProperties,datasource);
        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(datasource);
        xaDataSource.setUniqueResourceName("twoDataSource");
        return xaDataSource;
    }

    @Bean(name = "twoSqlSessionFactory")
    public SqlSessionFactory twoSqlSessionFactory(@Qualifier("twoDataSource") DataSource twoDataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(twoDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        bean.setMapperLocations(resolver.getResources("classpath:mapping/lee/*.xml"));
        return bean.getObject();
    }
}
