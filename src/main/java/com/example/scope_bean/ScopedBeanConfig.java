package com.example.scope_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.ApplicationScope;


@Configuration
public class ScopedBeanConfig {
    @Bean("requestUser")
    @ApplicationScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
    public User user(){
        return new User();
    }
}
