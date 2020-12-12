package com.cloud.order.controller;


import com.cloud.common.model.Result;
import com.cloud.common.model.vo.UserVo;
import com.cloud.order.feign.UserClient;
import com.cloud.order.model.Order;
import com.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author cgf
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserClient userClient;

    @GetMapping("/list")
    public List<Order> list() {
        return orderService.list();
    }

    @GetMapping("/userList")
    public Result<List<UserVo>> userList() {
        return userClient.getUsers();
    }
}

