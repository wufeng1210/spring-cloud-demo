package com.xbongbong.consul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wufeng
 * @date: 2018/7/11 19:25
 * @desrcption: 测试
 */
@RestController
public class TestController {

    @GetMapping(value = "/dc")
    public String index(){
        return "hello world";
    }
}
