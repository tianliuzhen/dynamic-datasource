package com.aaa.dynamicdatamybatishikari2.web;

import com.aaa.dynamicdatamybatishikari2.configs.LogFileName;
import com.aaa.dynamicdatamybatishikari2.configs.LoggerUtils;
import com.aaa.dynamicdatamybatishikari2.mapper.SysTwoMapper;
import com.aaa.dynamicdatamybatishikari2.mapper.SysUserOneMapper;
import com.aaa.dynamicdatamybatishikari2.mapper.TestBaseMapper;
import com.aaa.dynamicdatamybatishikari2.service.DbService;
import com.aaa.dynamicdatamybatishikari2.service.impl.SysUserSeriveImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
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
@Slf4j
public class TestWeb {

    @Autowired
    TestBaseMapper testBaseMapper;
    @Autowired
    SysTwoMapper sysTwoMapper;
    @Autowired
    SysUserOneMapper sysUserOneMapper;

    Logger ByDiy_log1 = LoggerUtils.Logger(LogFileName.ByDiy_log1);
    @PostMapping("/testA")
    public void  getA(){
        ByDiy_log1.info("baitiaoUserAppendered234e234");
        log.info("name","baitiaoUserAppender");
//        System.out.println(testBaseMapper.selectList(null).size());
//        System.out.println(sysTwoMapper.selectList(null).size());
//        System.out.println(sysUserOneMapper.selectList(null).size());
    }
    @Autowired
    private DbService dbService;

    @Autowired
    private SysUserSeriveImpl sysUserService;

    @GetMapping("/open2")
    public Object login(){
        return  dbService.selectTwo(1);
    }

    @GetMapping("/open")
    public Object login1(){
        return dbService.selectUser(1);
    }

    @GetMapping("/addBatch")
    public void addBatch(){
        sysUserService.insertBatch();
    }
}
