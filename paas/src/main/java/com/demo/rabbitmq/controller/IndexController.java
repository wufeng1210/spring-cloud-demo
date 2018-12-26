package com.demo.rabbitmq.controller;

import com.demo.rabbitmq.dto.resp.UserResp;
import com.demo.stream.stream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @author: wufeng
 * @date: 2018/7/12 11:03
 * @desrcption: 首页访问
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/findUser")
    public UserResp findUser(@NotNull Long id){
        return userService.findUser(id);
    }
}
