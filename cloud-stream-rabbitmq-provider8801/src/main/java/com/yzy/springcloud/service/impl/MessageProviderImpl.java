package com.yzy.springcloud.service.impl;

import com.yzy.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName MessageProviderImpl
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-11 20:36
 * @Version
 **/
@EnableBinding(Source.class) //可以理解为是一个信息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //消息生产者，输出一个信息
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: "+serial);
        return serial;

    }
}
