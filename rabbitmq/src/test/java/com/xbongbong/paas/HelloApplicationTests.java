package com.xbongbong.paas;

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
@SpringBootTest(classes = RabbitMQApplication.class)
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads() {
    }

    @Test
    public void hello(){
        sender.send();
    }
}
