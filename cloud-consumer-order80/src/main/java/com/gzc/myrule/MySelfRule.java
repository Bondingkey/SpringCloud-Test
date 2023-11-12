package com.gzc.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/11  16:14  周六
 * @Project: SpringCloud
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootConfiguration
public class MySelfRule{

    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }

}
