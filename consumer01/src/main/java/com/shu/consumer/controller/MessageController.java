package com.shu.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.security.rsa.RSASignature;

@RestController
public class MessageController {
    String url="http://server01/getUser";
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorGet")
    @RequestMapping("/getMessage")
    public String getMessage(){
        System.out.println("开始调用服务");
        String message=restTemplate.getForObject(url,String.class);
        System.out.println(message);
        return message;
    }

    public String errorGet(){
        System.out.println("调用服务失败");
        return "errorGet";
    }
}
