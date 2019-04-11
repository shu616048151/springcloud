package com.shu.server.controller;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "server01";
    }

    @RequestMapping("/users/getMessage")
    public String getMessage(){
        return "zuul:调用服务";
    }
}
