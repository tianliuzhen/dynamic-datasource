package com.aaa.dynamic_data_mybatis.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "支付服务文档接口")
public class SwaggerController {
    @PostMapping("/addUserInf")
    @ApiOperation(value = "增加信息")
    public String addUserInf() {

        return  "addUserInf";
    }
    @GetMapping("/deleteInf")
    @ApiOperation(value = "删除信息", notes = "根据删除信息")
    @ApiImplicitParam(name = "userId", value = "用户编码", required = true, dataType = "String", paramType = "query")
    public String deleteInf(String userId) {
        System.out.println(userId);
        return "deleteInf";
    }
    @PostMapping("/updateUser")
    @ApiOperation(value = "更新信息", notes = "根据用户编码更新信息")
    @ApiImplicitParam(name = "userId", value = "用户编码", required = true, dataType = "String", paramType = "query")
    public String updateUser(String userId) {
        System.out.println(userId);
        return "updateUser";
    }

}