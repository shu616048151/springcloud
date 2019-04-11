package com.shu.htystrix;

import com.sun.jersey.core.impl.provider.entity.XMLRootObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
