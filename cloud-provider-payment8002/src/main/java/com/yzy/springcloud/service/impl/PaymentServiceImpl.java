package com.yzy.springcloud.service.impl;

import com.yzy.springcloud.dao.PaymentDAO;
import com.yzy.springcloud.entities.Payment;
import com.yzy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 17:09
 * @Version
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO paymentDAO;

    @Override
    public int create(Payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }
}
