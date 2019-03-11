package com.demo.stream.service;

import org.springframework.integration.core.MessageSource;

/**
 * @author: wufeng
 * @date: 2018/12/26 13:51
 * @desrcption:
 */
public interface SendMsg {


    public MessageSource<String> sendTime();
}
