package com.shu.consumer.service;

import com.shu.consumer.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "server01",fallback = FallBackService.class)
public interface FeignHtstrixService {

    @RequestMapping("/getUser")
    public String getUser();
    @RequestMapping("/getUser1")
    public String getUser1(@RequestParam("id") String id);
    @RequestMapping("/getUser2")
    public String getUser2(@RequestBody User user);
    @RequestMapping("/getUser3/{id}")
    public String getUser3(@PathVariable("id") String id);
}
