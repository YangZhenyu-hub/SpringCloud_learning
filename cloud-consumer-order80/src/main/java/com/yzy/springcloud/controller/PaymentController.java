package com.yzy.springcloud.controller;

import com.yzy.springcloud.entities.CommonResult;
import com.yzy.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 21:22
 * @Version
 **/
@RestController
@Slf4j
public class PaymentController {
    // private static final String PAYMENT_URL = "http://localhost:8001";
    //加入Eureka集群后,不可写死，只需写服务名
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        log.info("payment:" + payment);
        log.info("url:" +PAYMENT_URL+"/payment/create");
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
