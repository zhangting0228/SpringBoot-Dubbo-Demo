package com.binfo.controller;

import com.binfo.model.UserDO;
import com.binfo.service.OrderServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 17:16
 */
@RestController
@RequestMapping("/dubbo-test")
public class OrderController {

    @Autowired
    private OrderServcie orderServcie;

    @RequestMapping("/getOrderById/{userId}")
    public List<UserDO> getOrderById(@PathVariable("userId") String userId) {
        return orderServcie.getOrderById(userId);
    }


}
