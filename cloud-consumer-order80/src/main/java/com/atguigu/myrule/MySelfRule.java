package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置Ribbon负载均衡
 * <p>
 * Ribbon负载均衡一定要避免@ComponentScan注解,因为如果被包扫描器扫到的话,那么这种负载均衡配置就相当于
 * 不是该服务特有的了
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
