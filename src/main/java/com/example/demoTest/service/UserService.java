package com.example.demoTest.service;

import com.example.demoTest.dto.User;
import com.example.demoTest.entity.UserEntity;
import com.example.demoTest.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Optional;

@Service
public class
UserService {


    @Autowired
    private UserRepo userRepo;

    //    @Autowired
//    private UserEntity userEntity;
    public String insert(User user) throws SQLException {

        int id = user.getUserId();
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setUserName(user.getUserName());
        userEntity.setAddress(user.getAddress());
        userEntity.setMobile(user.getPhone());
        userEntity.setEmail(user.getEmail());
      UserEntity userSearch=  userRepo.findByUserId(id);
        if (userSearch == null){
            userRepo.save(userEntity);
        return "Inserted Successfully...";}
        else
            return  "user already exist...";
    }
}