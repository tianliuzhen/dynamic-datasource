package com.aaa.dynamicdatamybatishikari2.dao;

import com.aaa.dynamicdatamybatishikari2.model.entity.db2.SysTwo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysTwoDao extends BaseMapper<SysTwo> {

}

