package com.aaa.mybatisplus.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.statement.delete.Delete;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Spring boot方式
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/21
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.baomidou.cloud.service.*.mapper*")
@Slf4j
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);



        List<ISqlParser> sqlParserList = new ArrayList<>();
        // 如果设置了全局逻辑删除、这里会失效，设置局部没关系已经测试
        // 攻击 SQL 阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser() {
            @Override
            public void processDelete(Delete delete) {
                // 如果你想自定义做点什么，可以重写父类方法像这样子
                if ("user_test".equals(delete.getTable().getName())) {
                    // 自定义跳过某个表，其他关联表可以调用 delete.getTables() 判断
                    log.info("跳过表:"+"user_test(这个表允许全部删除)");
                    return ;
                }
                super.processDelete(delete);
            }
        });
        paginationInterceptor.setSqlParserList(sqlParserList);

        return paginationInterceptor;
    }

    /**
     * 乐观锁插件
     * 当要更新一条记录的时候，希望这条记录没有被别人更新
     * 乐观锁实现方式：
     *     取出记录时，获取当前version
     *     更新时，带上这个version
     *     执行更新时， set version = newVersion where version = oldVersion
     *     如果version不对，就更新失败
     *     乐观锁配置需要2步 记得两步
     *     1.插件配置
     *     2.注解实体字段 @Version 必须要!
     *
     *
     * @return com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

}


