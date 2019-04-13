package com.shu.server.controller;

import net.sf.json.JSONObject;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ParamController {
    @RequestMapping("/json")
    public void getParamByJson(@RequestParam("id") String id,String name){
        System.out.println(id+name);
    }
    public String getParamByMap(){
        //MultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        return "";
    }
    @RequestMapping("/post")
    public String getParamByPost(Map<String,String> paramMap){
        //System.out.println(user);
        return "success";
    }

}
