package com.yzy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 16:17
 * @Version
 **/
@Configuration
@MapperScan({"com.yzy.springcloud.dao"})
public class MyBatisConfig {

}
