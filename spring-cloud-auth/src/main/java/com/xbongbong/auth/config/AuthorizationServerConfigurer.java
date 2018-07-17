package com.xbongbong.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * @author: wufeng
 * @date: 2018/7/17 17:15
 * @desrcption:
 */
public class AuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 使用in-memory存储
        clients.inMemory()
                // client_id
                .withClient("client")
                // client_secret
                .secret("secret")
                // 该client允许的授权类型
                .authorizedGrantTypes("authorization_code")
                // 允许的授权范围
                .scopes("app");
    }
}
