package com.demo.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:58
 **/
@Component
public class MyProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        rabbitTemplate.convertAndSend("DIRECT_EXCHANGE", "firstRouterKey", "a direct msg");

        rabbitTemplate.convertAndSend("TOPIC_EXCHANGE", "secondRouterKey.one", " a topic one msg");
        rabbitTemplate.convertAndSend("TOPIC_EXCHANGE", "secondRouterKey.two", " a topic two msg");

        rabbitTemplate.convertAndSend("FANOUT_EXCHANGE", "", "a fanout msg");

        amqpTemplate.convertAndSend("DIRECT_EXCHANGE", "fifthRouterKey", "a direct msg : fifth");
    }
}
