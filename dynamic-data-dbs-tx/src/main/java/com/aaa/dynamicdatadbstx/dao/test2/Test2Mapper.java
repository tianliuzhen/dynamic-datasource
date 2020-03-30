package com.aaa.dynamicdatadbstx.dao.test2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/13
 */
@Mapper
@Repository
public interface Test2Mapper {

    /**
     * 测试表一
     * @return java.util.List<java.util.Map>
     */
    List<Map> getAll();

    @Select("select * from  a")
    List<Map> getAll2();

    @Update("update a set b=9 where a=#{id} ")
    int updateByA(@Param("id") int id);
}
