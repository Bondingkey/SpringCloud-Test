package com.gzc.springcloud.Controller;

import com.gzc.springcloud.entities.CommonResult;
import com.gzc.springcloud.entities.Payment;
import com.gzc.springcloud.server.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/10  16:52  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(Payment payment){ //埋雷
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @RequestMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功"+port,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "hi ,i'am paymentzipkin server，welcome to atguigu，O(∩_∩)O哈哈~";
    }



    //测试超时
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        System.out.println("port = " + port);
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();} //单位秒

        return port;
    }


}
