package com.restful.service.impl;

import com.restful.dao.UserDao;
import com.restful.pojo.User;
import com.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User find() {
        return userDao.find(200);
    }
}
