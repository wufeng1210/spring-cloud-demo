package com.xbongbong.paas;

import org.springframework.amqp.core.CustomExchange;
import org.springframework.amqp.core.Exchange;
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
    public Exchange helloExchange(){
        return new CustomExchange("","");
    }
}
