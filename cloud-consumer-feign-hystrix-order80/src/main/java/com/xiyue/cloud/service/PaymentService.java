package com.xiyue.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    public String getPaymentInfo(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id);


}

