package com.dubbo.dytian.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.dubbo.dytian.api.service.IHelloService;
import com.dubbo.dytian.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDubboConfiguration
@RestController
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        System.out.println("调用提供者服务，参数name,888 "+name);
        return helloService.hello(name);
    }

}
