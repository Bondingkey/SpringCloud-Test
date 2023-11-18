package com.gzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/14  08:27  周二
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run( GateWayMain9527.class,args);
    }

}
