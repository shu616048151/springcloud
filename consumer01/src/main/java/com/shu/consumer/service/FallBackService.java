package com.shu.consumer.service;

import com.shu.consumer.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component //注入容器中
public class FallBackService implements  FeignHtstrixService {
    @Override
    public String getUser() {
        return "error,调用失败";
    }

    @Override
    public String getUser1(String id) {
        return null;
    }

    @Override
    public String getUser2(User user) {
        return null;
    }

    @Override
    public String getUser3(String id) {
        return null;
    }


}
