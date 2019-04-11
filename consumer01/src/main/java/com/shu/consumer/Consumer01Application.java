package com.shu.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients
public class Consumer01Application {
    public static void main(String[] args){
        SpringApplication.run(Consumer01Application.class,args);
    }
    @LoadBalanced
    @Bean
    //springcloud的服务调用只有两种方式ribbon+template和feign的两种负载均衡调用方式
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
