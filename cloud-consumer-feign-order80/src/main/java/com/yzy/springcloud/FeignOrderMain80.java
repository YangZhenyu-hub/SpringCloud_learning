package com.yzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName FeignOrderMain80
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-04 21:42
 * @Version
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderMain80.class, args);
    }
}
