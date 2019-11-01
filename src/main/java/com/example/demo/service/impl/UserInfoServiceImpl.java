package com.example.demo.service.impl;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserInfoServiceImpl
 * @Description: TODO
 * @Author zyang
 * @Date 2019/10/31
 * @Version V1.0
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        logger.info("userInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
