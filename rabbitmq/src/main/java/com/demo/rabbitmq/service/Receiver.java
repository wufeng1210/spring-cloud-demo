package com.demo.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wufeng
 * @date: 2018/12/25 10:16
 * @desrcption: 消费者
 * 注解很重要，标注了exchange、routingkey、queue之间的关系，对应指定到这个queue
 */
@Component
@RabbitListener(bindings = {@QueueBinding(value = @Queue(value = "hello"),
        exchange = @Exchange(value = "topic-exchange"), key = "hello")})
public class Receiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver："+hello);
    }
}
