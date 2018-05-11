package com.cris.starter.service;

import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName HelloService
 * @Description 自定义的组件，需要导入自定义的配置类
 * @Author zc-cris
 * @Version 1.0
 **/
public class HelloService {

    HelloServiceProperties helloServiceProperties;

    public String sayHello(String name){
        return helloServiceProperties.getPrefix()+"-"+name+"-"+helloServiceProperties.getSuffix();
    }

    public HelloServiceProperties getHelloServiceProperties() {
        return helloServiceProperties;
    }

    public void setHelloServiceProperties(HelloServiceProperties helloServiceProperties) {
        this.helloServiceProperties = helloServiceProperties;
    }
}
