package com.gzc.springcloud.dao;

import com.gzc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/10  16:43  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@Component       //代替@Repository声明bean
@Mapper               //mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
//@Repository     //spring提供的。在此，只是为了声明bean对象
public interface PaymentDao {

     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);

}
