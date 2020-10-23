package com.xiyue.cloud.service.impl;

import com.xiyue.cloud.entities.CommonResult;
import com.xiyue.cloud.entities.Payment;
import com.xiyue.cloud.service.PaymentService;
import org.springframework.stereotype.Component;


@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}


