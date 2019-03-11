package com.demo.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:54
 **/
@Component
@RabbitListener(queues = "FOURTH_QUEUE")
public class FourthConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("fourth queue received msg : " + msg);
    }
}
