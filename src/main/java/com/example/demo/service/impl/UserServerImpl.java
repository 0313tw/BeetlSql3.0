package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SQLReady;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:14
 * Description:
 */

@Slf4j
@Service
public class UserServerImpl implements UserService {
    @Override
    public User get(Integer id) {
        User user = new User();
        user.setId(id);
        return this.sqlManager.templateOne(user);
    }

    @Override
    public User getOfSql(Integer id) {
        String sql = "select * from sys_user where id=?";
        SQLReady sqlReady = new SQLReady(sql, id);
        return sqlManager.executeQueryOne(sqlReady, User.class);
    }

    @Override
    public User add(User user) {
        this.sqlManager.insert(user);
        return get(user.getId());
    }

    @Override
    public User updateOnly(User user) {
        sqlManager.updateTemplateById(user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Resource
    private SQLManager sqlManager;
}
