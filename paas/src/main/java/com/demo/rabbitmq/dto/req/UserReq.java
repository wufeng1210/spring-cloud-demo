package com.demo.rabbitmq.dto.req;

/**
 * @author: wufeng
 * @date: 2018/7/12 11:01
 * @desrcption: 封装接收页面传输过来的用户类数据
 */
public class UserReq {

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
