package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.SQLManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
      User user =   this.sqlManager.lambdaQuery(User.class)
                .andEq(User::getId,id)
                .single();
        return user;
    }

    @Override
    public User add(User user) {
         this.sqlManager.insert(user);
        return get(user.getId());
    }

    @Resource
    private SQLManager sqlManager;
}
