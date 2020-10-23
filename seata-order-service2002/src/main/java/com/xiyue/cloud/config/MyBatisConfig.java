package com.xiyue.cloud.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.xiyue.cloud.dao"})
public class MyBatisConfig {
}

