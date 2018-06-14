package com.java4all.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java4all.api.UserService;
import com.java4all.dao.UserDao;
import com.java4all.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User findByMobile(String mobile) {
        return userDao.findByMobile(mobile);
    }
}
