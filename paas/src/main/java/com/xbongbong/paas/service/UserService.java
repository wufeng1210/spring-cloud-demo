package com.xbongbong.paas.service;

import com.xbongbong.paas.dto.resp.UserResp;

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
     * @return com.xbongbong.paas.dto.resp.UserResp
     */
    UserResp findUser(Long id);
}
