package com.yzy.springcloud.service.impl;

import com.yzy.springcloud.dao.StorageDao;
import com.yzy.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName StorageServiceImpl
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 20:31
 * @Version
 **/
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;
    @Override
    @GlobalTransactional
    public void updateStorage(Long productId, Integer count) {
        log.info("seata-storage-service-->开始更新库存");
        storageDao.updateStorage(productId, count);
        log.info("seata-storage-service-->结束更新库存");
    }
}
