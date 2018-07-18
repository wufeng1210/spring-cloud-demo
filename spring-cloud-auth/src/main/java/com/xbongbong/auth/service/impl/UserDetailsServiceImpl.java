package com.xbongbong.auth.service.impl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author: wufeng
 * @date: 2018/7/18 9:53
 * @desrcption:
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final String USER_NAME = "admin";
    /**
     *
     * @author wufeng
     * @date 2018/7/18 14:07
     * @param username
     * @descption  授权登录
     * @return org.springframework.security.core.userdetails.UserDetails
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (USER_NAME.equalsIgnoreCase(username)) {
            User user = mockUser();
            return user;
        }
        return null;
    }

    private User mockUser() {
        Collection<GrantedAuthority> authorities = new HashSet<>();
        //用户所拥有的角色信息
        authorities.add(new SimpleGrantedAuthority("admin"));
        User user = new User("admin","123456",authorities);
        return user;
    }
}
