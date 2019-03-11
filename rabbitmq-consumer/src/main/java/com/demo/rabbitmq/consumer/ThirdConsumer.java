package com.demo.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:52
 **/
@Component
@RabbitListener(queues = "THIRD_QUEUE")
public class ThirdConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("third queue received msg : "+msg);
    }
}
