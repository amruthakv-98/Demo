package com.example.demoTest.controller;

import com.example.demoTest.dto.User;
import com.example.demoTest.service.UserService;
import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(value = "/insert")
    public String insertIntoTable(@Valid @RequestBody User user) throws SQLException {
       return userService.insert(user);
    }
}
