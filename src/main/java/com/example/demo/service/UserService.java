package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:13
 * Description:
 */
public interface UserService {
    User get(Integer id);

    User add(User user);
}
