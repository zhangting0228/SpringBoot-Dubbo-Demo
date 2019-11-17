package com.binfo.service;

import com.binfo.model.UserDO;

import java.io.IOException;
import java.util.List;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 17:12
 */
public interface OrderServcie {

    List<UserDO> getOrderById(String userId);

}
