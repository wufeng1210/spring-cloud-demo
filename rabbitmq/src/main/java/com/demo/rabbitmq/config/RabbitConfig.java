package com.demo.rabbitmq.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wufeng
 * @date: 2018/12/25 10:18
 * @desrcption:
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){

        return new Queue("hello");
    }


    @Bean
    public DirectExchange first(){
        return new DirectExchange("topic-exchange");
    }

}
