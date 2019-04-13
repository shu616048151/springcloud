package com.shu.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/getServer")
    public List<String> getServer(){
        List<String> services = discoveryClient.getServices();
        return services;
    }
}
