package com.gzc.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/11  10:10  周六
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootConfiguration//获取RestTemplate的配置类
public class GetRESTTemplateConfig {

    @Bean
    @LoadBalanced//开启Ribbon负载均衡
    public RestTemplate getrestTemplate(){
        return new RestTemplate();
    }
}
