package com.demo.stream.sevice.impl;

import com.demo.stream.sevice.ReceiveMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author: wufeng
 * @date: 2018/12/26 13:55
 * @desrcption:
 */
@Component
@EnableBinding(value= {Sink.class})
public class ReceiveMsgImpl implements ReceiveMsg {
    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(ReceiveMsgImpl.class);

    @Override
    @StreamListener(Sink.INPUT)
    public void receiveTime(Message<String> message) {
        logger.info("接收消息" + message.getPayload().toString());
    }

}
