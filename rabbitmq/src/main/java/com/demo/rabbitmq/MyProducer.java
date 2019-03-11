package com.demo.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: wufeng
 * @date: 2018/12/26 14:57
 * @desrcption:
 */
public class MyProducer {

    private final static String QUEUE_NAME = "ORIGIN_QUEUE";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);

        connectionFactory.setVirtualHost("/");

        connectionFactory.setUsername("eric");
        connectionFactory.setPassword("123456");

        Connection connection = connectionFactory.newConnection();

        Channel channel = connection.createChannel();

        String msg = "hello world，rabbitmq";
        channel.exchangeDeclare("hello-exchange", "direct");
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        // 发送消息（发送到默认交换机AMQP Default，Direct）
        // 如果有一个队列名称跟Routing Key相等，那么消息会路由到这个队列
        // String exchange, String routingKey, BasicProperties props, byte[] body
        channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
        channel.close();
        connection.close();
    }
}
