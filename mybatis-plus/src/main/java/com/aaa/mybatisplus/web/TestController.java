package com.aaa.mybatisplus.web;

import com.aaa.mybatisplus.entity.User;
import com.aaa.mybatisplus.enums.GenderEnum;
import com.aaa.mybatisplus.mapper.UserMapper;
import com.aaa.mybatisplus.service.User2Service;
import com.aaa.mybatisplus.service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "mybatis-plus 文档测试接口")
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private User2Service user2Service;

    @ApiOperation(value = "分页测试", notes = "插件测试")
    @ApiImplicitParam(name = "page", value = "分页参数", required = true)
    @GetMapping("/testSelectPage")
    public void testSelectPage(@RequestBody Page page) {
        System.out.println("分页测试：：：");
        if(page==null){
             page = new Page();
        }

        // 每页数量、当前页
        page.setSize(5).setCurrent(1);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        IPage<User> iPage=user2Service.selectUserPage(page, "tom");
        List<User> users=iPage.getRecords();
        users.forEach(System.out::println);

    }
    @ApiOperation(value = "测试逻辑删除")
    @GetMapping("/testUpdateLocal")
    public void testUpdateLocal() {
        // 测试逻辑删除
        //使用mp自带方法删除和查找都会附带逻辑删除功能 (自己写的xml不会包括注解)
        user2Service.removeById(2);
        user2Service.getById(1);
        System.out.println();
        //全表删除或更新
        userMapper.delete(null);
    }
    @ApiOperation(value = "测试序列化", notes = "mybatis-plus通用枚举")
    @GetMapping("/testSelect")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        System.out.println("测试序列化：：：：");
        String jsonString = JSONObject.toJSONString(userList);
        List<User> list = JSON.parseObject(jsonString, new TypeReference<List<User>>(){});
        list.forEach(System.out::println);
    }
    @ApiOperation(value = "普通测试", notes = "")
    @GetMapping("/testSelect2")
    public void testSelect2() {
        userService.getById(1);
        System.out.println(userService.list().size());
        System.out.println("---------");
        System.out.println(user2Service.list().size());
    }
    @ApiOperation(value = "批量添加")
    @GetMapping("/testAdds")
    public void testAdds() {
        List<User> list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User user=new User();
            user.setName("tom"+i);
            list.add(user);
        }
        User user1=new User();
        user1.setEmail("74@qq.com").setAge(GenderEnum.FEMALE).setId("1");
        //测试单个update
        //userService.updateById(user1);
        //测试批量添加
         userService.saveBatch(list);
    }
}
