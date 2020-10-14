package com.example.demo.entity.base;

import com.example.demo.annotation.Base64;
import com.example.demo.annotation.GetFile;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beetl.sql.annotation.builder.UpdateTime;
import org.beetl.sql.annotation.entity.AutoID;

import java.util.Date;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 14:38
 * Description:
 */
@Data
@EqualsAndHashCode
public class Base {

    @AutoID
    private Integer id;

//    @Base64
    private String name;

    private Date createTime;

    @UpdateTime
    private Date lastModified;
}
