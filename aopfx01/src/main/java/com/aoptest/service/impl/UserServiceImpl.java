package com.aoptest.service.impl;

import com.aoptest.service.UserService;
import org.springframework.stereotype.Service;

@Service("uservice")
public class UserServiceImpl implements UserService {
    @Override
    public void fun1() {
        System.out.println("方法1");
    }

    @Override
    public void fun2() {
        System.out.println("方法2");
    }

    @Override
    public void fun3() {
        System.out.println("方法3");
    }

    @Override
    public void fun4() {
//        System.out.println(1/0);

        System.out.println("方法4");
    }

    @Override
    public void fun5() {
        System.out.println("方法5");
        System.out.println(1/0);
    }
}
