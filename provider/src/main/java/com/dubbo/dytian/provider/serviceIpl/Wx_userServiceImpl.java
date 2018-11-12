package com.dubbo.dytian.provider.serviceIpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dubbo.dytian.provider.entity.Wx_user;
import com.dubbo.dytian.provider.mapper.Wx_userMapper;
import com.dubbo.dytian.provider.service.IWx_userService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信用户 服务实现类
 * </p>
 *
 * @author dytian
 * @since 2018-11-12
 */
@Service
public class Wx_userServiceImpl extends ServiceImpl<Wx_userMapper, Wx_user> implements IWx_userService {



}
