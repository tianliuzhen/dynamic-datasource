package com.aaa.mybatisplus.config.configRespone;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2020/1/14
 */
@Data
public class PageCollectionResponse<T> extends RestfulResponse {

    private static final long serialVersionUID = -3941953974584339445L;

    @ApiModelProperty(value = "接口响应数据（分页）")
    private Page<T> data;

    public PageCollectionResponse(Page<T> data) {

        super();

        this.data = data;

    }
}
