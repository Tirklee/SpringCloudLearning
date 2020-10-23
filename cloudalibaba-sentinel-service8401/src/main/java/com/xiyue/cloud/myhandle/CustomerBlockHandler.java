package com.xiyue.cloud.myhandle;


import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xiyue.cloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}
