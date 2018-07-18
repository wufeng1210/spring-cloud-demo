package com.xbongbong.auth.config;

import com.xbongbong.auth.service.impl.UserDetailsServiceImpl;
import com.xbongbong.auth.utils.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


/**
 * @author: wufeng
 * @date: 2018/7/18 9:58
 * @desrcption:
 */
@Order(10)
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login").permitAll().and().authorizeRequests().antMatchers("/health", "/css/**")
                .anonymous().and().authorizeRequests().anyRequest().authenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 明文
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("admin").password("123456").roles("admin");
        auth.userDetailsService(userDetailsService);
        auth.parentAuthenticationManager(authenticationManagerBean());
    }

    /**
     *
     * @author wufeng
     * @date 2018/7/18 14:06
     * @param
     * @descption 修复"message":"There is no PasswordEncoder mapped for the id \"null\"","path":"/oauth/token"
     * @return org.springframework.security.crypto.password.NoOpPasswordEncoder
     */
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
