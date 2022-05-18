package com.yzy.springcloud.controller;

import com.yzy.springcloud.domain.CommonResult;
import com.yzy.springcloud.service.StorageService;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName StorageController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 20:29
 * @Version
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/updateStorage")
    public CommonResult updateStorage( Long productId, Integer count) {
        storageService.updateStorage(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }


}
