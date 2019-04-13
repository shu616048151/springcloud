package com.shu.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "server01";
    }

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "zuul:调用服务";
    }
    @RequestMapping("/getIdAndName")
    public String getUser(String id,String name){
        return id+name;
    }
    @RequestMapping("/getMessage/{id}")
    public String getMessage(@PathVariable("id")  String id){
        return id;
    }
    @RequestMapping("/getUser1")
    public String getUser1( String id){
        System.out.println(id);
        return id;
    }
    @RequestMapping("/getUser2")
    public String getUser2(@RequestBody User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/getUser3/{id}")
    public String getUser3(@PathVariable String id){
        System.out.println(id);
        return id;
    }
}
