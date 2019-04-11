package com.shu.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server01",fallback = FallBackService.class)
public interface FeignHtstrixService {

    @RequestMapping("/getUser")
    public String getUser();
}
