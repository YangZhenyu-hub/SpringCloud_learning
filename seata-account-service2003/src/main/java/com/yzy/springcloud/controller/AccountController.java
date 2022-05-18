package com.yzy.springcloud.controller;

import com.yzy.springcloud.domain.CommonResult;
import com.yzy.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 21:18
 * @Version
 **/
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/account/updateAccount")
    public CommonResult updateAccount(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money) {
        accountService.updateAccount(userId, money);
        return new CommonResult(200, "扣减账户余额成功！");
    }
}
