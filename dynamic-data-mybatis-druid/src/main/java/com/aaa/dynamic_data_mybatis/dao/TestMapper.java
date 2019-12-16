package com.aaa.dynamic_data_mybatis.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TestMapper {
    @DS("slave")
    @Select({" select * from a  "})
    List<Map> getList();

    @DS("master")
    @Select({" select * from a  "})
    List<Map> getList2();
}
