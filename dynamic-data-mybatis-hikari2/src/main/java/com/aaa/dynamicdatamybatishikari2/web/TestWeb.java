package com.aaa.dynamicdatamybatishikari2.web;

import com.aaa.dynamicdatamybatishikari2.mapper.TestBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/testA")
    public void  getA(){
        System.out.println(testBaseMapper.selectList(null).size());
    }
}
