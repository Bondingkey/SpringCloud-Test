package com.gzc.springcloud.server.impl;

import com.gzc.springcloud.dao.PaymentDao;
import com.gzc.springcloud.entities.Payment;
import com.gzc.springcloud.server.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/10  16:49  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Service
public class PaymentImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
