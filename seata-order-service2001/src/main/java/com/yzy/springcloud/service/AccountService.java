package com.yzy.springcloud.service;

import com.yzy.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 19:40
 * @Version
 **/
@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/updateAccount")
    CommonResult updateAccount(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
