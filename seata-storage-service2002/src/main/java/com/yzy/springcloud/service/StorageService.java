package com.yzy.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 20:31
 * @Version
 **/
public interface StorageService {
    void updateStorage(Long productId, Integer count);
}
