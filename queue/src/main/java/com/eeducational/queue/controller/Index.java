package com.eeducational.queue.controller;

import com.eeducational.queue.entity.Account;
import com.eeducational.queue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IUserService userService;

    @PostConstruct
    private void init() {

    }

    @RequestMapping("")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("addUsers")
    @ResponseBody
    String addUsers() {

        Account account1 = new Account();
        Account account2 = new Account();

        account1.mobile = "13660577336";

        account2.mobile = "13660577116";

        userService.addUsers(account1, account2);

        return "ok";
    }

}
