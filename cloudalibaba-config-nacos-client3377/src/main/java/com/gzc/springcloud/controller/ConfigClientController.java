package com.gzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/16  16:37  周四
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@RestController
@RefreshScope   //通过SpringCould原生注解@RefreshScope实现配置自动更新
public class ConfigClientController{
    @Value("${config.info}") //对应nacos配置:nacos-config-client-dev.yaml
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}

