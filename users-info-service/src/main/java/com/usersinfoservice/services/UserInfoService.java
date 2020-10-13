package com.usersinfoservice.services;

import com.usersinfoservice.models.UserInfo;
import com.usersinfoservice.models.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    UserInfoRepository repository;

    public UserInfo addNewUserInfo(UserInfo userInfo) {
        return repository.save(userInfo);
    }

    public UserInfo getUserById(long id) {
        return repository.findById(id).orElse(new UserInfo(0, "Not Available"));
    }
}
