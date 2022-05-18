package com.yzy.springcloud.controller;

import com.yzy.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SendMessageController
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-11 20:41
 * @Version
 **/
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/message")
    public String sendMessage() {
        return messageProvider.send();
    }

}
