package com.aaa.dynamicdatamybatishikari2.model.entity.db;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: Mr.裴
 * @create 2019/9/29
 * @Description: db1 表对象
 **/
@Setter
@Getter
@ToString
@TableName("sys_user_one")
@Accessors(chain = true)
public class SysUserOne implements Serializable {
    private static final long serialVersionUID = 1L;

    /**user_id*/
    @TableId
    private Integer userId;

    /**user_name */
    private String userName;

    public SysUserOne() {}

}
