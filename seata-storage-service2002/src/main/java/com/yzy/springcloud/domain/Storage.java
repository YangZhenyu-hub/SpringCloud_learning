package com.yzy.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.checkerframework.checker.units.qual.A;

/**
 * @ClassName Storage
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 20:34
 * @Version
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Storage {
    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
