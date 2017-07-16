package com.eeducational.queue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by OuYiJian on 2017/3/8.
 */
@Component
public class Config {

    @Value("${allowOrigin}")
    private String allowOrigin;

    public String getAllowOrigin() {
        return allowOrigin;
    }
}
