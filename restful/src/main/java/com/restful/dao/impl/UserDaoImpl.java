package com.restful.dao.impl;

import com.restful.dao.UserDao;
import com.restful.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User find(Integer uid) {
        User user=new User();
        user.setUserId(888);
        user.setUserName("jack");
        return user;
    }
}
