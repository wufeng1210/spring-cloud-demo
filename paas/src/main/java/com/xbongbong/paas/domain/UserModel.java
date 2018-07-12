package com.xbongbong.paas.domain;

/**
 * @author: wufeng
 * @date: 2018/7/12 15:27
 * @desrcption: 从数据库中查询出来的数据
 */
public class UserModel {

    private Long id;

    private String userName;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
