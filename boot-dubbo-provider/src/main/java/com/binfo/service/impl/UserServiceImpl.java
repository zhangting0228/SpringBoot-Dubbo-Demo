package com.binfo.service.impl;

import com.binfo.model.UserDO;
import com.binfo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 16:34
 */

/**
 * 属于Dubbo的@Service注解，非Spring  作用：暴露服务
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDO selectUserById(String id) {
        UserDO userDO = new UserDO();
        userDO.setId("1");
        userDO.setName("张挺");
        userDO.setAge(24);
        userDO.setAddress("软件大道180号");
        return userDO;
    }
}
