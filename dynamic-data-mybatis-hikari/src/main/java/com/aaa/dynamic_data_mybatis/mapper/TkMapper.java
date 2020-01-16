package com.aaa.dynamic_data_mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/1/16
 */
public interface TkMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
