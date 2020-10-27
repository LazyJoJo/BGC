package com.zcb.cloud.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests(authorize -> authorize
////                .antMatchers("/eureka/**").permitAll()
//                .anyRequest().authenticated());
        http.authorizeRequests()
//                .antMatchers("/eureka/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic();

        http.csrf().disable();
//        super.configure(http);
    }
}
