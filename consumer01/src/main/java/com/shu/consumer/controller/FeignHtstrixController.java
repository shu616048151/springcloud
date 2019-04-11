package com.shu.consumer.controller;

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

}
