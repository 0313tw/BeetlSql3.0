package com.example.demo.entity;

import com.example.demo.annotation.Base64;
import com.example.demo.entity.base.File;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beetl.sql.annotation.builder.UpdateTime;
import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.Table;
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
@Fetch(level = 2)
@EqualsAndHashCode(callSuper = true)
public class User extends File {

    private Integer departmentId;

    @FetchOne("departmentId")
    private Department department;

    @FetchSql("SELECT `name` FROM sys_user WHERE department_id = #departmentId#")
    private String userName;
}
