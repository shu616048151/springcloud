package com.shu.consumer.controller;

import com.shu.consumer.domain.User;
import com.shu.consumer.service.FeignHtstrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign接口调用的方式
 */
@RestController
public class FeignHtstrixController {
    @Autowired
    private FeignHtstrixService feignHtstrixService;


    @RequestMapping("/getUserByFeign")
    public String get(){
        return feignHtstrixService.getUser();
    }
    @RequestMapping("/feig/getUser1")
    public String get1(){
        String str = feignHtstrixService.getUser1("zhangsan");
        System.out.println(str);
        return str;
    }
    @RequestMapping("/feig/getUser2")
    public String get2(){
        User user=new User("123","zhangsan");
        String str = feignHtstrixService.getUser2(user);
        System.out.println(str);
        return "success";
    }
    @RequestMapping("/feig/getUser3")
    public String get3(){
        String str = feignHtstrixService.getUser1("lisi");
        System.out.println(str);
        return "success";
    }
}
