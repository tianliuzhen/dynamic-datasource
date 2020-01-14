package com.aaa.mybatisplus.common;

import com.aaa.mybatisplus.config.configRespone.Constants;
import com.aaa.mybatisplus.config.configRespone.Response;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description: 公共参数
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/1/14
 */
@Data
public abstract class BaseRestfulResponse implements Response {

    private static final long serialVersionUID = -7443304902819898146L;

    @ApiModelProperty(value = "响应状态码",example = "200")
    private int code = Constants.DEFAULT_OK;

    @ApiModelProperty(value = "响应消息",example = "success")
    private String message = Constants.DEFAULT_SUCCESS;

    @ApiModelProperty(value = "响应状态",example = "true")
    private Boolean success = true;

}
