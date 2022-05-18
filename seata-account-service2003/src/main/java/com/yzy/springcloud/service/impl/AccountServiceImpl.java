package com.yzy.springcloud.service.impl;

import com.yzy.springcloud.dao.AccountDao;
import com.yzy.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 21:19
 * @Version
 **/
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;
    @Override
    public void updateAccount(Long userId, BigDecimal money) {
        log.info("seata-account-service-->开始更新账户");
        accountDao.update(userId, money);
        log.info("seata-account-service-->结束更新账户");
    }
}
