package com.example.scope_bean;

import com.example.scope_bean.filter.SecondFilter;
import com.example.scope_bean.filter.TestFilter;
import com.example.scope_bean.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAsync
public class ScopeBeanApplication   {

    @Bean
    public FilterRegistrationBean<SecondFilter> filterSecondBean(){
        FilterRegistrationBean<SecondFilter> filter = new FilterRegistrationBean<>();
        SecondFilter secondFilter = new SecondFilter();
        filter.setFilter(secondFilter);
        filter.setEnabled(true);
        filter.setOrder(10);
        filter.addUrlPatterns("/login");
        return filter;
    }
    @Bean
    public FilterRegistrationBean<TestFilter> filterTestBean(){
        FilterRegistrationBean<TestFilter> filter = new FilterRegistrationBean<>();
        TestFilter testFilter = new TestFilter();
        filter.setFilter(testFilter);
        filter.setEnabled(true);
        filter.setOrder(1);
        filter.addUrlPatterns("/login");
        return filter;
    }




    public static void main(String[] args) {
        SpringApplication.run(ScopeBeanApplication.class, args);
    }

}
