package com.example.demo.entity;

import com.example.demo.entity.base.File;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.Table;
import org.beetl.sql.fetch.annotation.Fetch;
import org.beetl.sql.fetch.annotation.FetchSql;

import java.util.List;

/**
 * Author: 陈艺博
 * Date:  2020-10-13 10:38
 * Description:
 */
@Data
@Table(name = "department")
@Fetch(level = 2)
@EqualsAndHashCode()
public class Department extends File {

    private Integer order;

    //    @FetchMany("departmentId")
    @FetchSql("select * from sys_user where department_id = #id#")
    private List<User> users;
}
