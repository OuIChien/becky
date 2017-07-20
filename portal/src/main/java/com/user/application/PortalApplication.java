package com.user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gary on 2017/7/20.
 */
@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class PortalApplication {

    public static void main(String[] args){
        SpringApplication.run(PortalApplication.class,args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello world!";
    }
}
