package com.yzy.springcloud.dao;

import com.yzy.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 11:54
 * @Version
 **/
@Mapper
public interface OrderDao {
    /**
     *
     * @Description TODO 创建订单
     * @author yzy 729141789@qq.com
     * @Date 11:56 2022/5/17
     * @param order
     * @return void
     */
    void create(Order order);
    /**
     * 修改订单状态
     * @Description TODO
     * @author yzy 729141789@qq.com
     * @Date 11:57 2022/5/17
     * @param userId
     * @param status
     * @return void
     */
    void updateOrder(@Param("userId") Long userId,@Param("status") Integer status);
}
