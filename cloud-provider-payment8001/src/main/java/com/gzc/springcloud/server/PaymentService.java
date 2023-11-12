package com.gzc.springcloud.server;

import com.gzc.springcloud.entities.Payment;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/10  16:47  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */

public interface PaymentService {

         int create(Payment payment); //写
         Payment getPaymentById(Long id);  //读取

}
