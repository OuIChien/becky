package com.eeducational.queue;

import com.eeducational.queue.filter.CORSFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by OuYiJian on 2017/4/7.
 */
@Configuration
public class WebConfig {

    @Autowired
    private Config config;

    @Bean
    public FilterRegistrationBean registFilter() {
        CORSFilter corsFilter = new CORSFilter();
        corsFilter.allowOrigin = config.getAllowOrigin();
        FilterRegistrationBean registration = new FilterRegistrationBean(corsFilter);
        registration.addUrlPatterns("/*");
        return registration;
    }

}
