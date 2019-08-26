package com.example.controller;


import com.example.domain.User;
import com.example.service.com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;



@Controller
public class UserController {


    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/shiwu")
    @ResponseBody
    public List<User> getAllUser(){

        List<User> users=userService.getUser();
        return users;
    }


}
