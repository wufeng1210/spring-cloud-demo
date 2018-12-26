package com.demo.stream.service;

import org.springframework.messaging.Message;

/**
 * @author: wufeng
 * @date: 2018/12/26 13:54
 * @desrcption:
 */
public interface ReceiveMsg {

    public void receiveTime(Message<String> message);
}
