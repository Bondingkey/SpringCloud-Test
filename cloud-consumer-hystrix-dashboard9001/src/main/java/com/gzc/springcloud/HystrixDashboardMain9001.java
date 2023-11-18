package com.gzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/13  16:29  周一
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001{
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
