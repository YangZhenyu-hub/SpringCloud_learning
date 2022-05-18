package com.yzy.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yzy.springcloud.entities.CommonResult;

/**
 * @ClassName CustomerHandler
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-16 16:50
 * @Version
 **/
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }
}
