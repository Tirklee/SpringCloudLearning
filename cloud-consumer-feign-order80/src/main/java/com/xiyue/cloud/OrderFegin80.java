package com.xiyue.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderFegin80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFegin80.class,args);
    }
}
