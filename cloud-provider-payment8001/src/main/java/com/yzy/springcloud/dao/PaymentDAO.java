package com.yzy.springcloud.dao;

import com.yzy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDAO
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 16:36
 * @Version
 **/
@Mapper
public interface PaymentDAO {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
