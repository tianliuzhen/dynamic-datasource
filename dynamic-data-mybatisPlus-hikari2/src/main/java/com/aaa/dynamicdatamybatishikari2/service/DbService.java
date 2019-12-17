package com.aaa.dynamicdatamybatishikari2.service;


import com.aaa.dynamicdatamybatishikari2.model.entity.db.SysUserOne;
import com.aaa.dynamicdatamybatishikari2.model.entity.db2.SysTwo;

public interface DbService {

     SysUserOne selectUser(long id);

    SysTwo selectTwo(long id);

    int insertUser(SysUserOne sysUserOne);

    int insertTwo(SysTwo sysTwo);



}
