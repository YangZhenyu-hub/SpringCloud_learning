package com.yzy.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StorageDao
 * @Description TODO
 * @Author yzy 729141789@qq.com
 * @Date 2022-05-17 20:24
 * @Version
 **/
@Mapper
public interface StorageDao {
    void updateStorage(@Param("productId") Long productId, @Param("count") Integer count);
}
