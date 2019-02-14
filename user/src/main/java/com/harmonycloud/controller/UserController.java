package com.harmonycloud.controller;


import com.harmonycloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody Map<String,String> param){
        try {
            String loginname = param.get("loginname");
            String password = param.get("password");
            return userService.login(loginname, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
