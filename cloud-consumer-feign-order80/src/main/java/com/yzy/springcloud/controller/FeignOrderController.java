package com.yzy.springcloud.controller;

import com.yzy.springcloud.entities.CommonResult;
import com.yzy.springcloud.entities.Payment;
import com.yzy.springcloud.service.FeignPaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FeignOrderController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-04 21:44
 * @Version
 **/
@RestController
public class FeignOrderController {
    @Resource
    private FeignPaymentService feignPaymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return feignPaymentService.getPaymentById(id);
    }
}
