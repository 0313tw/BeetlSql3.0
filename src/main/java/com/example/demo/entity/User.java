package com.example.demo.entity;

import lombok.Data;
import org.beetl.sql.annotation.builder.UpdateTime;
import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.InsertIgnore;
import org.beetl.sql.annotation.entity.Table;
import org.beetl.sql.annotation.entity.UpdateIgnore;
import org.beetl.sql.fetch.annotation.Fetch;
import org.beetl.sql.fetch.annotation.FetchOne;
import org.beetl.sql.fetch.annotation.FetchSql;

import java.util.Date;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:16
 * Description:
 */
@Data
@Table(name = "sys_user")
@Fetch(level = 1)
public class User {

    @AutoID
    private Integer id;
    private String name;
    private int departmentId;
//    @UpdateTime
    private Date createTime;

    @UpdateIgnore
    @InsertIgnore
    @FetchOne("departmentId")
    private Department department;

    @UpdateIgnore
    @InsertIgnore
    @FetchSql("SELECT `name` FROM sys_user WHERE department_id = #{departmentId}")
    private String userName;
}
