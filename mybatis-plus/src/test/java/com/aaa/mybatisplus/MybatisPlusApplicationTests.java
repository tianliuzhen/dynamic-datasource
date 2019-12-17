package com.aaa.mybatisplus;

import com.aaa.mybatisplus.entity.User;
import com.aaa.mybatisplus.mapper.UserMapper;
import com.aaa.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
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
