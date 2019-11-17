package com.binfo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.binfo.model.UserDO;
import com.binfo.service.OrderServcie;
import com.binfo.service.UserService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 17:11
 */
@Service
public class OrderServiceImpl implements OrderServcie {

    @Reference
    private UserService userService;

    @Override
    public List<UserDO> getOrderById(String userId) {
        List<UserDO> list = new ArrayList<UserDO>();
        UserDO userDO1 = new UserDO();
        userDO1.setId("2");
        userDO1.setName("张三");
        userDO1.setAddress("康润园");
        userDO1.setAge(24);
        list.add(userDO1);
        UserDO userDO2 = userService.selectUserById("1");
        System.out.println(userDO2);
        return list;
    }
}
