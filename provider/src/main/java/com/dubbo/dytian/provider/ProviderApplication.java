package com.dubbo.dytian.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.dubbo.dytian.provider.mapper")
@ComponentScan("com.dubbo.*")
public class ProviderApplication  {


    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
