package com.aaa.dynamicdatamybatishikari2.base;

import com.aaa.dynamicdatamybatishikari2.model.entity.db.SysUserOne;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/17
 */
@Repository
@Mapper
public interface SysUserService extends IService<SysUserOne> {


}
