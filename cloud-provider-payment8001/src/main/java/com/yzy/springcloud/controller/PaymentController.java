package com.yzy.springcloud.controller;

import com.yzy.springcloud.entities.CommonResult;
import com.yzy.springcloud.entities.Payment;
import com.yzy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 18:56
 * @Version
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        log.info("*****插入的payment："+payment+"  serverPort:"+serverPort);
        int result = paymentService.create(payment);
        log.info("*****插入的结果："+result);
        //插入成功
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment == null) {
            return new CommonResult(444, "没有对应记录，查询ID：" + id+" serverPort"+serverPort, null);
        } else {
            return new CommonResult(200, "查询成功,serverPort"+serverPort, payment);
        }
    }

    @GetMapping("/payment/discovery")
    public Object getDiscovery() {
        //发现服务，有哪些注册的服务
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

}
