package com.gzc.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gzc.springcloud.entities.CommonResult;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/18  09:20  周六
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义限流处理信息.... CustomerBlockHandler --- 1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2022,"自定义限流处理信息.... CustomerBlockHandler --- 2");
    }
}

