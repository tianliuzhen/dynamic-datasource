package com.aaa.mybatisplus.web;

import com.aaa.mybatisplus.common.BaseController;
import com.aaa.mybatisplus.common.HttpResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/1/14
 */
@RestController
public class BaseControllerImpl extends BaseController {


    @PostMapping ("/test")
    public HttpResult<Map> updateUser() {
        try {
            Map map=new HashMap();
            map.put("key","val");
            return responseOK(map);

        } catch (Exception ex) {
            //异常处理
            return responseFail();
        }
    }
}
