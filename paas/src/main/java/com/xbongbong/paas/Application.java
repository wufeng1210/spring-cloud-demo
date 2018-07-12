package com.xbongbong.paas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: wufeng
 * @date: 2018/7/12 11:10
 * @desrcption: 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(Application.class, args);
    }
}
