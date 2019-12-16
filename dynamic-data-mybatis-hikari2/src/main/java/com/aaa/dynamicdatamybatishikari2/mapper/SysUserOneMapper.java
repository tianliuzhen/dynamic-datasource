package com.aaa.dynamicdatamybatishikari2.mapper;

import com.aaa.dynamicdatamybatishikari2.configs.annotation.DB;
import com.aaa.dynamicdatamybatishikari2.enums.DataSourceType;
import com.aaa.dynamicdatamybatishikari2.model.entity.db.SysUserOne;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
@DB(DataSourceType.DB2)
public interface SysUserOneMapper extends BaseMapper<SysUserOne> {
}
