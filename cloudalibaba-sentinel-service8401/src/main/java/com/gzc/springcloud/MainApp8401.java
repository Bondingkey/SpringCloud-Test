package com.gzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/17  16:50  周五
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401{
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }
}
