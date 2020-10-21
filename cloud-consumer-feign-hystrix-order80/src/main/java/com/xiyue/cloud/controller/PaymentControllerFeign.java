package com.xiyue.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiyue.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Clobal_FallBackMethod")
public class PaymentControllerFeign {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/{id}")
    @HystrixCommand
    //@HystrixCommand(fallbackMethod = "paymentTimeOutFallBackMethod")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentService.getPaymentInfo(id);
    }

    @GetMapping("/consumer/payment/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id){
        return paymentService.paymentTimeout(id);
    }

    public String paymentTimeOutFallBackMethod(@PathVariable("id")Integer id){
        return "对方系统繁忙或者已经down机,请10秒钟后再次尝试";
    }

    public String payment_Clobal_FallBackMethod(){
        return "Clobal 222  对方系统繁忙或者已经down机,请10秒钟后再次尝试";
    }


}
