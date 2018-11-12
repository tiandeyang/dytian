package com.dubbo.dytian.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dubbo.dytian.api.entity.WxUser;
import com.dubbo.dytian.api.service.WxUserService;
import com.dubbo.dytian.provider.entity.Wx_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service(interfaceClass = WxUserService.class,version = "1.0")
@Component
public class WxUserServiceImp implements WxUserService {

    @Autowired
    IWx_userService iWx_userService;

    @Override
    public WxUser getUserByOpenid(String openid) {

        EntityWrapper<Wx_user> where = new EntityWrapper<>();
        where.eq("user_open_id",openid);
        Wx_user wx_user = iWx_userService.selectOne(where);

        WxUser wxUser = new WxUser();
        wxUser.setOpenid(openid);
        wxUser.setXv_id(wx_user.getXv_id());

        return wxUser;
    }

}
