package com.eeducational.queue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by OuYiJian on 2017/3/7.
 */
@Controller
@RequestMapping("/")
public class Index extends BaseController {

    @PostConstruct
    private void init() {

    }

    @RequestMapping("")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
