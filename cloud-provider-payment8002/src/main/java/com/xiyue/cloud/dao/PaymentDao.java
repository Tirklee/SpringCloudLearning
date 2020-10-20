package com.xiyue.cloud.dao;

import com.xiyue.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao{

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
