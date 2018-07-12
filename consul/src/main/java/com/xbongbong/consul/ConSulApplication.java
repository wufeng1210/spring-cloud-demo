package com.xbongbong.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: wufeng
 * @date: 2018/7/11 18:57
 * @desrcption: 启动服务
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConSulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConSulApplication.class).run(args);
    }
}
