package com.yzy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用前端返回类
 * @ClassName CommonResult
 * @Description TODO 通用前端返回类
 * @Author yzy 729141789@qq.com
 * @Date 2022-04-29 16:28
 * @Version
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * @Description TODO 操作结果代码
     * @author yzy 729141789@qq.com
     * @Date 16:30 2022/4/29
     * @param null
     * @return
     */
    private Integer code;

    /**
     *
     * @Description TODO 操作结果描述信息
     * @author yzy 729141789@qq.com
     * @Date 16:32 2022/4/29
     * @param null
     * @return
     */
    private String message;

    /**
     *
     * @Description TODO 操作结果数据
     * @author yzy 729141789@qq.com
     * @Date 16:33 2022/4/29
     * @param null
     * @return
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
