package com.xbongbong.auth.dto.req;

import org.springframework.security.oauth2.common.AuthenticationScheme;

import java.util.List;

/**
 * @author: wufeng
 * @date: 2018/7/17 20:36
 * @desrcption: 注册服务
 */
@Deprecated
public class AuthReq {

    private String clientSecret;

    private String userAuthorizationUri;

    private String clientId;

    private AuthenticationScheme scheme;

    private String acessTokenUri;

    private List<String> scope;

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUserAuthorizationUri() {
        return userAuthorizationUri;
    }

    public void setUserAuthorizationUri(String userAuthorizationUri) {
        this.userAuthorizationUri = userAuthorizationUri;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AuthenticationScheme getScheme() {
        return scheme;
    }

    public void setScheme(AuthenticationScheme scheme) {
        this.scheme = scheme;
    }

    public String getAcessTokenUri() {
        return acessTokenUri;
    }

    public void setAcessTokenUri(String acessTokenUri) {
        this.acessTokenUri = acessTokenUri;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }
}
