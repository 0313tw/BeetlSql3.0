package com.example.demo.entity;

import lombok.Data;
import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.annotation.entity.Table;
import org.beetl.sql.fetch.annotation.Fetch;
import org.beetl.sql.fetch.annotation.FetchMany;

import java.util.List;

/**
 * Author: 陈艺博
 * Date:  2020-10-13 10:38
 * Description:
 */
@Data
@Table(name = "department")
@Fetch(level = 1)
public class Department {

    @AutoID
    private Integer id;

    private String name;

    private Integer order;

    @FetchMany("departmentId")
    private List<User> users;
}
