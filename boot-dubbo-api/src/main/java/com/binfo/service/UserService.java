package com.binfo.service;

import com.binfo.model.UserDO;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 16:28
 */
public interface UserService {

    UserDO selectUserById(String id);
}
