package com.demo.test;

import com.demo.rabbitmq.producer.MyProducer;
import com.demo.rabbitmq.producer.ProducerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: wufeng
 * @date: 2018/12/25 10:21
 * @desrcption:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
public class ProducerTest {

    @Autowired
    private MyProducer myProducer;

    @Test
    public void contextLoads() {
    }

    @Test
    public void send(){
        myProducer.send();
    }
}
