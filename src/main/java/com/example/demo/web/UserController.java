package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.page.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:18
 * Description:
 */
@Slf4j
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User get(@PathVariable("id") Integer id) {
        return userService.get(id);
    }

    @PostMapping("/user")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("/user/{id}/sql")
    public User getSql(@PathVariable("id") Integer id) {
        return userService.getOfSql(id);
    }

    @PutMapping("/user")
    public User updateOnly(@RequestBody User user) {
        return userService.updateOnly(user);
    }

    @GetMapping("/user/find")
    public PageResult<User> findUser(@RequestParam(value = "size", required = false, defaultValue = "5") Integer pageSize,
                                     @RequestParam(value = "number", required = false, defaultValue = "1") Integer pageNumber) {
        return userService.find(pageSize, pageNumber);
    }

    @Resource
    private UserService userService;
}
