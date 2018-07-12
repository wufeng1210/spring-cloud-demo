package com.xbongbong.paas.service.impl;

import com.xbongbong.paas.dao.UserDao;
import com.xbongbong.paas.domain.UserModel;
import com.xbongbong.paas.dto.resp.UserResp;
import com.xbongbong.paas.service.UserService;
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
    private UserDao userDao;

    @Override
    public UserResp findUser(Long id) {
        UserModel userModel = userDao.findUser(id);
        UserResp userResp = new UserResp();
        userResp.setUserModel(userModel);
        return userResp;
    }
}