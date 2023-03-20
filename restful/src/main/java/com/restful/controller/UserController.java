package com.restful.controller;

import com.restful.pojo.User;
import com.restful.returns.Returnx;
import com.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{uid}")
    public Returnx find(@PathVariable Integer uid){
        User user=new User();
        user.setUserId(1);
        user.setUserName("jack");

        Returnx returnx=new Returnx();
        returnx.setHttpstatus(200);
        returnx.setInfo("okok");

        returnx.setUser(user);

        return returnx;
    }
}
