package com.cris.starter.service;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName HelloServiceProperties
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "cris.hello")   // 引入配置文件中以cris.hello 开头的配置
public class HelloServiceProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
