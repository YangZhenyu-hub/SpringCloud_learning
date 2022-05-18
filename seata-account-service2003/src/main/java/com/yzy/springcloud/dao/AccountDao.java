package com.yzy.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ClassName AccountDao
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 21:20
 * @Version
 **/
@Mapper
public interface AccountDao {
    void update(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
