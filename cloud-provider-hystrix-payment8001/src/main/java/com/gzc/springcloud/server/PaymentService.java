package com.gzc.springcloud.server;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/12  09:47  周日
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
public interface PaymentService {

    public String paymentInfo_OK(Integer id);
    public String payment_Timeout(Integer id);

}
