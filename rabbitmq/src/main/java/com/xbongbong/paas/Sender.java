package com.xbongbong.paas;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: wufeng
 * @date: 2018/12/25 10:14
 * @desrcption: 发送方
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(){
        String content = "hello " + new Date();
        System.out.println("content："+content);
        this.amqpTemplate.convertAndSend("hello",content);
    }
}
