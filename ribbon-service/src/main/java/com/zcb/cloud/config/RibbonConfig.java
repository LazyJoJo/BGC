package com.zcb.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    /**
     * 核心是服务都必须注册到eureka-server中，ribbon就能够通过@LoadBalanced来提供负载均衡效果
     * ribbon也可以单独使用，就是没有服务框架（eureka）时，需要手动在配置中指定对应的服务器
     * 所谓的负载均衡策略，就是当A服务调用B服务时，此时B服务有多个实例，这时A服务以何种方式来选择调用的B实例
     **/

    @Bean
    @LoadBalanced   // 通过控制调用实体，让其实现负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }



}
