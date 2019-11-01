package com.example.demo.service;

import com.example.demo.model.UserInfo;

/**
 * @ClassName UserInfoService
 * @Description: TODO
 * @Author zyang
 * @Date 2019/10/31
 * @Version V1.0
 **/
public interface UserInfoService {
    /**
    * 通过username查询用户信息
    * @param username
    * @return com.example.demo.model.UserInfo
    **/
    public UserInfo findByUsername(String username);
}
