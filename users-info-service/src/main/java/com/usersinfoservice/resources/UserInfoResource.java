package com.usersinfoservice.resources;

import com.usersinfoservice.models.UserInfo;
import com.usersinfoservice.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-info")
public class UserInfoResource {

    @Autowired
    UserInfoService service;

    @PostMapping("/add")
    public UserInfo addNewUserInfo(@RequestBody UserInfo userInfo) {
        return service.addNewUserInfo(userInfo);
    }


    @GetMapping("/get/{userId}")
    public UserInfo getUserById(@PathVariable("userId") long id){
        return service.getUserById(id);
    }
}
