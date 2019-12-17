package com.aaa.dynamicdatamybatishikari2.mapper;

import com.aaa.dynamicdatamybatishikari2.configs.annotation.DB;
import com.aaa.dynamicdatamybatishikari2.enums.DataSourceType;
import com.aaa.dynamicdatamybatishikari2.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/16
 */
@Repository
@Mapper
@DB(DataSourceType.DB2)
public interface TestBaseMapper extends BaseMapper<User> {

}