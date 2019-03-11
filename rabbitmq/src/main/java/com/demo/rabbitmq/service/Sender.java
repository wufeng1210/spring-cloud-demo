package com.demo.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
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

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void send(){
        String content = "hello " + new Date();
        System.out.println("content："+content);
        this.amqpTemplate.convertAndSend("topic-exchange", "hello", content);
//        this.amqpTemplate.convertAndSend("hello",content);
    }
}
