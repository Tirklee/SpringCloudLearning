package com.xiyue.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiyue.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }

    @GetMapping(value = "/payment/get/{id}")
    public String getPaymentInfo(@PathVariable("id") Integer id){
        return String.valueOf(id);
    }
    @GetMapping(value = "/payment/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id){
        return String.valueOf(id);
    }

    @GetMapping("/payment/hystrix/{id}")
    @HystrixCommand(fallbackMethod = "")
    public String paymentInfo(@PathVariable("id")Integer id){
        if(id>0){
            return "调用支付接口hystrix服务：\t"+serverPort+"\t entity ID: "+id;
        }else{
            throw new RuntimeException("ID不能是负数");
        }
    }

    public String paymentInfoHandleException(Integer id){
        return "调用支付接口hystrix服务出现异常：\t"+"ID不能是负数";
    }
    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }

}