package com.java4all.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java4all.api.UserService;
import com.java4all.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "user")
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "showName",method = RequestMethod.GET)
    public String showName(String mobile){
        User user = userService.findByMobile(mobile);
        String name = user.getName();
        return name+"你好啊!!!";
    }
}
