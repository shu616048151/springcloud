package com.shu.consumer.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    final  String prefixName="http://server01";
    @Autowired
    private RestTemplate restTemplate;

    public String getIdAndName(String id,String name){
        return restTemplate.getForObject(prefixName+"/getIdAndName",String.class,id,name);
    }
    public String getMessageById(String id){
        return restTemplate.getForObject(prefixName+"/getMessage/"+id,String.class);
    }
    public String  getUser(String id){
        return restTemplate.getForObject(prefixName+"/getUser1",String.class,id);
    }

}
