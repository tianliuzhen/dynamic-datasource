package com.aaa.dynamic.web;

import com.aaa.dynamic.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;
    @GetMapping("/test")
    public void  test(){
        List<Map> list= testMapper.getList();
        for (Map map : list) {
            System.out.println(map.get("a")+""+map.get("b"));
        }
        System.out.println("------- " +
                "List -------");
        List<Map> list2= testMapper.getList2();
        for (Map map : list2) {
            System.out.println(map.get("a")+""+map.get("b"));
        }
    }
}
