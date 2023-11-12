package com.gzc.springcloud;

import org.checkerframework.checker.units.qual.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/11  16:55  周六
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudFeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeginApplication.class, args);
    }
}
