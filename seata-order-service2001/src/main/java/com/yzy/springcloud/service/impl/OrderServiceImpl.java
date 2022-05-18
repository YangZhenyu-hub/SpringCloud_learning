package com.yzy.springcloud.service.impl;

import com.yzy.springcloud.dao.OrderDao;
import com.yzy.springcloud.domain.Order;
import com.yzy.springcloud.service.AccountService;
import com.yzy.springcloud.service.OrderService;
import com.yzy.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 16:00
 * @Version
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void createOrder(Order order) {
        log.info("开始创建订单");
        log.info(order.toString());
        log.info("向数据库中新增订单");
        orderDao.create(order);
        log.info("订单创建已完成");

        log.info("开始更新Storage");
        storageService.updateStorage(order.getProductId(), order.getCount());
        log.info("结束更新Storage");

        log.info("开始更新Account");
        accountService.updateAccount(order.getUserId(), order.getMoney());
        log.info("结束更新Account");

        log.info("开始更新Order");
        orderDao.updateOrder(order.getId(), 1);
        log.info("结束更新Order");
    }
}
