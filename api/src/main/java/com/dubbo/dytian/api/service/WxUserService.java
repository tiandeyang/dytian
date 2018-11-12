package com.dubbo.dytian.api.service;

import com.dubbo.dytian.api.entity.WxUser;

public interface WxUserService {

    WxUser getUserByOpenid(String openid);

}
