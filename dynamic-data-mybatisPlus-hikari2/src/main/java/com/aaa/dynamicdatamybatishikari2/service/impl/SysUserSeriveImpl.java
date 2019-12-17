package com.aaa.dynamicdatamybatishikari2.service.impl;

import com.aaa.dynamicdatamybatishikari2.base.SysUserService;
import com.aaa.dynamicdatamybatishikari2.mapper.SysUserOneMapper;
import com.aaa.dynamicdatamybatishikari2.model.entity.db.SysUserOne;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/17
 */
@Service
public class SysUserSeriveImpl  extends ServiceImpl<SysUserOneMapper, SysUserOne>  implements SysUserService {

    @Autowired
    private  SysUserService sysUserService;

    public void  insertBatch(){
        List<SysUserOne> list =new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            SysUserOne sysUserOne=new SysUserOne();
            sysUserOne.setUserId(i).setUserName("tom"+i);
            list.add(sysUserOne);
        }
        sysUserService.getById(1);
//        sysUserService.saveBatch(list);
    }
}
