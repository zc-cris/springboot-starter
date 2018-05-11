package com.cris.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloServiceConfiguration
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@Configuration      // 指明这是一个配置类
@ConditionalOnWebApplication    // 这个配置类需要在web开发环境下才生效
@EnableConfigurationProperties(HelloServiceProperties.class)    // 扫描并导入指定的properties 类
public class HelloServiceConfiguration {

    @Autowired
    HelloServiceProperties helloServiceProperties;

    // 将HelloService 组件放入到容器中
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloServiceProperties(helloServiceProperties);
        return helloService;
    }


}
