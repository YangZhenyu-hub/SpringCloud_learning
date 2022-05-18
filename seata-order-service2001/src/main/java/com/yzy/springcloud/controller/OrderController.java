package com.yzy.springcloud.controller;

import com.yzy.springcloud.domain.CommonResult;
import com.yzy.springcloud.domain.Order;
import com.yzy.springcloud.service.OrderService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 16:10
 * @Version
 **/
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult orderCreate(Order order) {
        orderService.createOrder(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
