package com.yzy.springcloud.domain;

import java.math.BigDecimal;

/**
 * @ClassName Account
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 21:23
 * @Version
 **/
public class Account {
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
