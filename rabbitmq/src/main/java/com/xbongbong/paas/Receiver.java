package com.xbongbong.paas;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wufeng
 * @date: 2018/12/25 10:16
 * @desrcption: 消费者
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver："+hello);
    }
}
