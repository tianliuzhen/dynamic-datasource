package com.aaa.mybatisplus.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: 泛型的参数
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResult<T> extends BaseRestfulResponse{

    @ApiModelProperty(value = "泛型-接口响应数据")
    private T data;


}
