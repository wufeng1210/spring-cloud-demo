package com.xbongbong.paas.test;

import com.xbongbong.paas.Application;
import com.xbongbong.paas.dto.resp.UserResp;
import com.xbongbong.paas.service.UserService;
import com.xbongbong.paas.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author: wufeng
 * @date: 2018/7/12 20:00
 * @desrcption:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserTestMapper {

    private static final Logger logger = LoggerFactory.getLogger(UserTestMapper.class);

    @Autowired
    private UserService userService;


    @Test
    public void findUser(){
        UserResp userResp = userService.findUser(1L);
        logger.info(userResp.getUserModel().getUserName());
    }
}
