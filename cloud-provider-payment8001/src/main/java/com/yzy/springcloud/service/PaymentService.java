package com.yzy.springcloud.service;

import com.yzy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 17:08
 * @Version
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
