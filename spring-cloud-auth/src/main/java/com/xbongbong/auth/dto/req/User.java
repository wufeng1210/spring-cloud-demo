package com.xbongbong.auth.dto.req;

/**
 * @author: wufeng
 * @date: 2018/7/18 9:54
 * @desrcption:
 */
public class User {

    private String userName;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
