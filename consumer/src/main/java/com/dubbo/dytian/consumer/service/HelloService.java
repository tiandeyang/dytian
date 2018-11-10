package com.dubbo.dytian.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dytian.api.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloService {


    @Reference
    IHelloService iHelloService;


    public String hello(String name){
        return iHelloService.hello(name);
    }


}
