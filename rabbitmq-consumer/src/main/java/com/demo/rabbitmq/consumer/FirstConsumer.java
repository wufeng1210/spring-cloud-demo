package com.demo.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:48
 **/
@Component
@RabbitListener(queues = "FIRST_QUEUE")
public class FirstConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("first queue received msg : " + msg);
    }
}
