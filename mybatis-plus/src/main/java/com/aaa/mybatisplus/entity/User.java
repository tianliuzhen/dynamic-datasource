package com.aaa.mybatisplus.entity;

import com.aaa.mybatisplus.enums.GenderEnum;
import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/17
 */
@Data
@Accessors(chain = true)
@JSONType(serializeEnumAsJavaBean = true)
public class User {
    private Long id;
    private String name;
    private GenderEnum age;
    private String email;
}

