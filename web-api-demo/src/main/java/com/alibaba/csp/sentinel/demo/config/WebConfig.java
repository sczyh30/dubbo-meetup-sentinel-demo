package com.alibaba.csp.sentinel.demo.config;

import javax.servlet.Filter;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Eric Zhao
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean sentinelFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/*");
        registration.setName("sentinelCommonFilter");
        registration.setOrder(1);

        return registration;
    }

}
