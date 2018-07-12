package com.xbongbong.paas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: wufeng
 * @date: 2018/7/12 11:10
 * @desrcption: 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xbongbong.paas.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
