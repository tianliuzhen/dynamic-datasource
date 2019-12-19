package com.aaa.mybatisplus.web;

import com.aaa.mybatisplus.entity.User;
import com.aaa.mybatisplus.mapper.UserMapper;
import com.aaa.mybatisplus.service.User2Service;
import com.aaa.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private User2Service user2Service;

    @GetMapping("testSelect")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    @GetMapping("testSelect2")
    public void testSelect2() {
        System.out.println(userService.list().size());
        System.out.println("---------");
        System.out.println(user2Service.list().size());
    }
    @GetMapping("testAdds")
    public void testAdds() {
        List<User> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            User user=new User();
            user.setName("tom"+i);
            list.add(user);
        }
        userService.saveBatch(list);
    }
}