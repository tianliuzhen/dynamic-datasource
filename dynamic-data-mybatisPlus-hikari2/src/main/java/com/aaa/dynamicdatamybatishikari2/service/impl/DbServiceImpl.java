package com.aaa.dynamicdatamybatishikari2.service.impl;

import com.aaa.dynamicdatamybatishikari2.base.SysUserService;
import com.aaa.dynamicdatamybatishikari2.configs.annotation.DB;
import com.aaa.dynamicdatamybatishikari2.dao.SysTwoDao;
import com.aaa.dynamicdatamybatishikari2.dao.SysUserOneDao;
import com.aaa.dynamicdatamybatishikari2.enums.DataSourceType;
import com.aaa.dynamicdatamybatishikari2.model.entity.db.SysUserOne;
import com.aaa.dynamicdatamybatishikari2.model.entity.db2.SysTwo;
import com.aaa.dynamicdatamybatishikari2.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.裴
 * @create 2019/9/29
 * @Description:
 **/
@Service
public class DbServiceImpl implements DbService {

    @Autowired
    private SysUserOneDao sysUserOneDao;

    @Autowired
    private SysTwoDao sysTwoDao;

    @Autowired
    private SysUserService sysUserService;


    @DB
    @Override
    public SysUserOne selectUser(long id) {
        return sysUserOneDao.selectById(id);
    }

    @DB(DataSourceType.DB2)
    @Override
    public SysTwo selectTwo(long id) {
        return sysTwoDao.selectById(id);
    }

    @Override
    public int insertUser(SysUserOne sysUserOne) {
        return sysUserOneDao.insert(sysUserOne);
    }

    @DB(DataSourceType.DB2)
    @Override
    public int insertTwo(SysTwo sysTwo) {
        return sysTwoDao.insert(sysTwo);
    }


}
