package com.yzy.springcloud.service;

import com.yzy.springcloud.entities.CommonResult;
import com.yzy.springcloud.entities.Payment;
import com.yzy.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-16 17:21
 * @Version
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
