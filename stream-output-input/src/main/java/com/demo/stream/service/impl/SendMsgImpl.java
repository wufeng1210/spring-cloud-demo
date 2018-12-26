package com.demo.stream.service.impl;

import com.demo.stream.service.SendMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wufeng
 * @date: 2018/12/26 13:52
 * @desrcption:
 */
@EnableBinding(value= {Source.class})
public class SendMsgImpl implements SendMsg {
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(SendMsgImpl.class);

    private String format="yyyy-MM-dd  HH:mm:ss";

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "2000", maxMessagesPerPoll = "1"))
    @Override
    public MessageSource<String> sendTime() {
        logger.info(new SimpleDateFormat(format).format(new Date()));
        return () -> new GenericMessage<>(new SimpleDateFormat(format).format(new Date()));
    }
}
