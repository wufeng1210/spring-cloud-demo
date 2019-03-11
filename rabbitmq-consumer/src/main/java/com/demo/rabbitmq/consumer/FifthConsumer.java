package com.demo.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wufeng
 * @date: 2018/12/27 14:57
 * @desrcption:
 */
@Component
@RabbitListener(queues = "FIFTH_QUEUE")
public class FifthConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("fifth queue received msg : " + msg);
    }
}
