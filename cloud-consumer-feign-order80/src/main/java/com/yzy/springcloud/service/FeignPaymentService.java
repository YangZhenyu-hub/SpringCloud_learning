package com.yzy.springcloud.service;

import com.yzy.springcloud.entities.CommonResult;
import com.yzy.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName FeignPaymentService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-04 21:45
 * @Version
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface FeignPaymentService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
