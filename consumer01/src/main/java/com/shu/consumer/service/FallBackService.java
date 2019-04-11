package com.shu.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component //注入容器中
public class FallBackService implements  FeignHtstrixService {
    @Override
    public String getUser() {
        return "error,调用失败";
    }
}
