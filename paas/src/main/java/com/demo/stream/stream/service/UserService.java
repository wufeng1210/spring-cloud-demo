package com.demo.stream.stream.service;

import com.demo.rabbitmq.dto.resp.UserResp;

/**
 * @author: wufeng
 * @date: 2018/7/12 15:07
 * @desrcption:
 */
public interface UserService {

    /**
     * 查询用户
     * @author wufeng
     * @date 2018/7/12 15:08
     * @param id
     * @descption
     * @return UserResp
     */
    UserResp findUser(Long id);
}
