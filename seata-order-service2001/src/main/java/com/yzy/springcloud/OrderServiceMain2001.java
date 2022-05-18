package com.yzy.springcloud;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderServiceMain2001
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 0:28
 * @Version
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoDataSourceProxy
public class OrderServiceMain2001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceMain2001.class, args);
    }
}
