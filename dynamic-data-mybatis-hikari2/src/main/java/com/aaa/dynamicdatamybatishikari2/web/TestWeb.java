package com.aaa.dynamicdatamybatishikari2.web;

import com.aaa.dynamicdatamybatishikari2.mapper.SysTwoMapper;
import com.aaa.dynamicdatamybatishikari2.mapper.SysUserOneMapper;
import com.aaa.dynamicdatamybatishikari2.mapper.TestBaseMapper;
import com.aaa.dynamicdatamybatishikari2.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/16
 */
@RestController
public class TestWeb {

    @Autowired
    TestBaseMapper testBaseMapper;
    @Autowired
    SysTwoMapper sysTwoMapper;
    @Autowired
    SysUserOneMapper sysUserOneMapper;

    @PostMapping("/testA")
    public void  getA(){
        System.out.println(testBaseMapper.selectList(null).size());
        System.out.println(sysTwoMapper.selectList(null).size());
        System.out.println(sysUserOneMapper.selectList(null).size());
    }
    @Autowired
    private DbService dbService;

    @GetMapping("/open2")
    public Object login(){
        return  dbService.selectTwo(1);
    }

    @GetMapping("/open")
    public Object login1(){
        return dbService.selectUser(1);
    }
}
