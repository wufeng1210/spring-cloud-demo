package com.xbongbong.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: wufeng
 * @date: 2018/7/17 15:32
 * @desrcption:
 * 步骤：
 * 1、访问地址：http://localhost:1103/oauth/authorize?response_type=code&client_id=client&redirect_uri=http://baidu.com&state=123 跳转至登录界面login.ftl；登录账号/密码：admin/123456
 * 2、登录成功之后到达authorize.ftl界面选择：approve
 * 3、会跳转至www.baidu.com，在链接尾部会有code字段；
 * 4、利用第3步的code字段，发送post请求，地址为：http://localhost:1103/oauth/token?client_id=client&grant_type=authorization_code&redirect_uri=http://baidu.com&code=Bp8Hq5
 * 5、第一次需要输入账号和密码，分别为：client/secret，登录后，获取返回的access_token
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login");
        registry.addViewController("/oauth/confirm_access").setViewName("authorize");
    }
}
