package com.yzy.springcloud.service;

import java.math.BigDecimal;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 21:19
 * @Version
 **/
public interface AccountService {

    void updateAccount(Long userId, BigDecimal money);
}
