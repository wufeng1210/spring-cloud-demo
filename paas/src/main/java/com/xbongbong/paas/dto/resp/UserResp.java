package com.xbongbong.paas.dto.resp;

import com.xbongbong.paas.domain.UserModel;

/**
 * @author: wufeng
 * @date: 2018/7/12 15:08
 * @desrcption: 封装返回页面的数据
 */
public class UserResp {

    private UserModel userModel;

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
