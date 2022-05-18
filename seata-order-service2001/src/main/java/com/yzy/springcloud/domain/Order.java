package com.yzy.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 11:47
 * @Version
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;

    /*
    订单状态：  0：创建中；1：已完结
     */
    private Integer status;
}
