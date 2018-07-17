package com.xbongbong.auth.service;

import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

/**
 * @author: wufeng
 * @date: 2018/7/17 16:03
 * @desrcption: 上下文
 */
@Service
public class AuthService {

    OAuth2RestTemplate oAuth2RestTemplate;

    public String auth(){
        return oAuth2RestTemplate.getAccessToken().getValue();
    }

}
