package com.xiyue.cloud.controller;


import com.xiyue.cloud.domain.CommonResult;
import com.xiyue.cloud.domain.Order;
import com.xiyue.cloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(@RequestBody  Order order)
    {
         orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

