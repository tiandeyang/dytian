package com.dubbo.dytian.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dytian.api.service.IHelloService;
import org.springframework.stereotype.Component;

/**
 * 定义一个服务实现类
 * @author oKong
 *
 */
// 这里注意 此类@service是dubbo的

@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

	@Override
	public String hello(String name) {
		System.out.println("dubbo提供者，参数name:999"+ name);
		return "hello " + name + ",this is a dubbo provider!";
	}

}