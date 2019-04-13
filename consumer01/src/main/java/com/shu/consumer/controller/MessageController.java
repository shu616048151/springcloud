package com.shu.consumer.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shu.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.security.rsa.RSASignature;

@RestController
public class MessageController {
    String url="http://server01/getUser";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "errorGet")
    @RequestMapping("/getMessage")
    public String getMessage(){
        System.out.println("开始调用服务");
        String message=restTemplate.getForObject(url,String.class);
        System.out.println(message);
        return message;
    }

    public String errorGet() {
        return "getMessage调用失败";
    }

    @RequestMapping("/getIdAndName")
    public String getUser(String id,String name){
        return userService.getIdAndName(id,name);
    }
    @RequestMapping("/getMessage/{id}")
    public String getMessage(@PathVariable("id")  String id){
        return userService.getMessageById(id);
    }
    @RequestMapping("/getUser1")
    public String getUser1(String id){
        return userService.getUser(id);
    }
}
