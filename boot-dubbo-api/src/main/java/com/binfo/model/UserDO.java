package com.binfo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 张挺（zhangting@binfo-tech.com）
 * @Description
 * @Date 2019/11/17 16:28
 */
@Data
public class UserDO implements Serializable {

    private String id;
    private String name;
    private int age;
    private String address;

}
