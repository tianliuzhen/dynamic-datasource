package com.aaa.dynamicdatamybatishikari2.model.entity.db2;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: Mr.裴
 * @create 2019/9/29
 * @Description:
 **/
@Setter
@Getter
@ToString
@TableName("sys_two")
public class SysTwo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * two_id
     */
    @TableId
    private Integer twoId;

    /**
     * two_remark
     */
    private String twoRemark;

    public SysTwo() {
    }

}