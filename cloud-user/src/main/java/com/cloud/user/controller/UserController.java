package com.cloud.user.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloud.common.model.Result;
import com.cloud.user.model.User;
import com.cloud.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author cgf
 * @since 2020-12-03
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @SentinelResource(value = "user", fallback = "fallback")
    public Result list() {
        List<User> list = userService.list();
        return Result.success(list);
    }

    public Result fallback(Throwable ex) {
        log.error("查询用户列表异常," + ex.getMessage(), ex);
        return Result.fail("查询用户列表异常");
    }
}

