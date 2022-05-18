package com.yzy.springcloud.config;

import com.alibaba.nacos.client.utils.StringUtils;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.seata.core.context.RootContext;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-18 2:23
 * @Version
 **/
// @Configuration
public class FeignConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String xid = RootContext.getXID();
        System.out.println("----FeignConfig first get xid ----" + xid);
        if (StringUtils.isNotEmpty(xid)) {
            System.out.println("----FeignConfig second get xid ----" + xid);
            requestTemplate.header(RootContext.KEY_XID, xid);
        }
    }
}
