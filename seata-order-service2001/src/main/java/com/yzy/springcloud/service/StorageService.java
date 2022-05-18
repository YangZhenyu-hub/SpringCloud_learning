package com.yzy.springcloud.service;

import com.yzy.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 17:15
 * @Version
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/updateStorage")
    CommonResult updateStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
