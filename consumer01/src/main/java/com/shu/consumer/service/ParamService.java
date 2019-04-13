package com.shu.consumer.service;

import com.netflix.discovery.converters.Auto;
import com.shu.consumer.domain.User;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ParamService {
    final String prefixName="http://server01";
    @Autowired
    private RestTemplate restTemplate;

    /**
     * json方式请求数据
     * @return
     */
    @RequestMapping("/json")
    public void getParamByJson(){
        User user=new User("123","zhangsan");
        JSONObject jsonObject= JSONObject.fromObject(user);
        String json=jsonObject.toString();
        Map<String,String> map=new HashMap<>();
        map.put("id","123");
        map.put("name","zhangsan");
        restTemplate.getForObject(prefixName+"/json?id={id}&name={name}",String.class,map);
    }
    public String getParamByMap(){
        //MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

       return "";
    }
    @RequestMapping("/post")
    public void  getParamByPost(){
        String id="zahngsan";
        MultiValueMap<String,String> paramMap = new LinkedMultiValueMap<>();
        paramMap.add("id","meihaorens");
        paramMap.add("name","shuzhiyang");
        User user=new User("123","武汉理工大学");
        restTemplate.postForObject(prefixName+"/post",paramMap,String.class);
        //pojo方式
        //restTemplate.postForObject(prefixName+"/post",user,String.class);


    }

}
