package com.dubbo.dytian.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dytian.api.entity.WxUser;
import com.dubbo.dytian.api.service.WxUserService;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    @Reference(version = "1.0")
    WxUserService wxUserService;


   public WxUser getUser(String openid ){
        return wxUserService.getUserByOpenid(openid);
    }


}
