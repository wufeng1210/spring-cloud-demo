package com.demo.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:51
 **/
@Component
@RabbitListener(queues = "SECOND_QUEUE")
public class SecondConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("second queue received msg : "+msg);
    }
}
