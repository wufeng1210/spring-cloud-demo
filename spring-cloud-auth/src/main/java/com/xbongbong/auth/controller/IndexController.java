package com.xbongbong.auth.controller;

import com.xbongbong.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: wufeng
 * @date: 2018/7/17 15:54
 * @desrcption:
 */
@RestController
public class IndexController {

    @Autowired
    private AuthService authService;


    @GetMapping("/dc")
    public String index(){
        return authService.auth();
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}
