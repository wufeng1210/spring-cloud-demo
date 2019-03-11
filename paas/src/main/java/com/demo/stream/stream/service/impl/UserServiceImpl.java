package com.demo.stream.stream.service.impl;

import com.demo.rabbitmq.dao.UserDaoMapper;
import com.demo.rabbitmq.domain.UserModel;
import com.demo.rabbitmq.dto.resp.UserResp;
import com.demo.stream.stream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wufeng
 * @date: 2018/7/12 15:09
 * @desrcption:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoMapper userDaoMapper;

    @Override
    public UserResp findUser(Long id) {
        UserModel userModel = userDaoMapper.findUser(id);
        UserResp userResp = new UserResp();
        userResp.setUserModel(userModel);
        return userResp;
    }
}
