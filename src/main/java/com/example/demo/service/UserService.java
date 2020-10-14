package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:13
 * Description:
 */
public interface UserService {
    /**
     * 通过userId获取
     */
    User get(Integer id);

    /**
     * 通过 sql语句 获取 User
     * @param id
     * @return
     */
    User getOfSql(Integer id);

    /**
     * 添加user
     */
    User add(User user);

    /**
     * 更新not null的属性值
     */
    User updateOnly(User user);

    /**
     * 更新对象属性
     */
    User update(User user);
}
