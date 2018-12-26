package com.demo.rabbitmq.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author: wufeng
 * @date: 2018/12/26 15:30
 * @desrcption:
 */
public interface MqMessageSource {


    String OUTPUT = "MyOutput";

    String INPUT = "MyInput";

    @Output(OUTPUT)
    MessageChannel messageOutput();

    @Input(INPUT)
    MessageChannel messageInput();
}
