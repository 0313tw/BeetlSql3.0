package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.core.page.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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
        var user = new User();
        user.setId(id);
        return this.sqlManager.templateOne(user);
    }

    @Override
    public User getOfSql(Integer id) {
        var sql = "select * from sys_user where id=?";
        var sqlReady = new SQLReady(sql, id);
        return sqlManager.executeQueryOne(sqlReady, User.class);
    }

    @Override
    public User add(User user) {
        user.setCreateTime(new Date());
        this.sqlManager.insert(user);
        return get(user.getId());
    }

    @Override
    public User updateOnly(User user) {
        sqlManager.updateTemplateById(user);
        return get(user.getId());
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public PageResult<User> find(Integer pageSize, Integer pageNumber) {
        return sqlManager.lambdaQuery(User.class)
                .page(pageNumber, pageSize);
    }

    @Resource
    private SQLManager sqlManager;
}
