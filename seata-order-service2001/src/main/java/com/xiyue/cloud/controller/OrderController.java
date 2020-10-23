package com.xiyue.cloud.controller;


import com.xiyue.cloud.domain.CommonResult;
import com.xiyue.cloud.domain.Order;
import com.xiyue.cloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        log.info("================================="+order.toString());
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

