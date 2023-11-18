package com.gzc.springcloud.controller;

import com.gzc.springcloud.entities.CommonResult;
import com.gzc.springcloud.entities.Payment;
import com.gzc.springcloud.server.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/11  16:59  周六
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;  //调用远程的微服接口

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
