package com.gzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/14  15:56  周二
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
public class PaymentController{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id) {
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }
}

