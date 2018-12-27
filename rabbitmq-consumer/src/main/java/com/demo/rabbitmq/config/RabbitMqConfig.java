package com.demo.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: wufeng
 * @create: 2018-12-26 23:37
 **/
@Configuration
public class RabbitMqConfig {


    @Bean("directExchange")
    public DirectExchange directExchange(){
        return new DirectExchange("DIRECT_EXCHANGE");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("TOPIC_EXCHANGE");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("FANOUT_EXCHANGE");
    }

    @Bean("firstQueue")
    public Queue firstQueue(){
        return new Queue("FIRST_QUEUE");
    }

    @Bean
    public Queue secondQueue(){
        return new Queue("SECOND_QUEUE");
    }
    @Bean
    public Queue thirdQueue(){
        return new Queue("THIRD_QUEUE");
    }
    @Bean
    public Queue fourthQueue(){
        return new Queue("FOURTH_QUEUE");
    }


    @Bean
    public Binding directBinding(@Qualifier("firstQueue") Queue queue,
                                 @Qualifier("directExchange") DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("firstRouterKey");
    }

    @Bean
    public Binding topicBinding(@Qualifier("secondQueue") Queue queue,
                                 @Qualifier("topicExchange") TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("secondRouterKey.*");
    }


    @Bean
    public Binding thirdBinding(@Qualifier("thirdQueue") Queue queue,
                                @Qualifier("fanoutExchange") FanoutExchange exchange){
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    public Binding fourthBinding(@Qualifier("fourthQueue") Queue queue,
                                 @Qualifier("fanoutExchange") FanoutExchange exchange){
        return BindingBuilder.bind(queue).to(exchange);
    }

}
