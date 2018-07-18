package com.xbongbong.auth.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: wufeng
 * @date: 2018/7/18 11:18
 * @desrcption:
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword.toString());
    }
}
