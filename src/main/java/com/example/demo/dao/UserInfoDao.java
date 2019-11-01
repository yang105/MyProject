package com.example.demo.dao;

import com.example.demo.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName UserInfoDao
 * @Description: TODO
 * @Author zyang
 * @Date 2019/10/31
 * @Version V1.0
 **/
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**
    *通过username查找用户信息
    * @param username
    * @return com.example.demo.model.UserInfo
    **/
    public UserInfo findByUsername(String username);
}
