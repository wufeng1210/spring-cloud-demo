package com.xbongbong.auth.config;

import com.xbongbong.auth.dto.req.AuthReq;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.nio.charset.Charset;

/**
 * @author: wufeng
 * @date: 2018/7/17 16:39
 * @desrcption:
 */
public class OAuth2Config {


    /**
     *
     * @author wufeng
     * @date 2018/7/17 20:43
     * @param authReq
     * @descption
     * @return org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails
     */
    @Bean
    public ClientCredentialsResourceDetails getClientCredentialsResourceDetails(AuthReq authReq) {
        ClientCredentialsResourceDetails oAuth2Details = new ClientCredentialsResourceDetails();
        oAuth2Details.setAuthenticationScheme(authReq.getScheme());
        oAuth2Details.setClientAuthenticationScheme(authReq.getScheme());
        oAuth2Details.setClientId("");
        oAuth2Details.setClientSecret("");
        oAuth2Details.setAccessTokenUri(authReq.getAcessTokenUri());
        oAuth2Details.setScope(authReq.getScope());
        return oAuth2Details;
    }

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Resource
    private OAuth2ClientContext oAuth2ClientContext;

//    @Bean
//    @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
//    public RestTemplate googleOAuth2RestTemplate() {
//        return new OAuth2RestTemplate(getClientCredentialsResourceDetails(), oAuth2ClientContext);
//    }

    private RestTemplate getRestTemplate(ClientCredentialsResourceDetails clientCredentialsResourceDetails){
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(clientCredentialsResourceDetails, new DefaultOAuth2ClientContext());
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(180000);
        requestFactory.setReadTimeout(180000);
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("utf-8")));
        return restTemplate;
    }

}
