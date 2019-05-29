package com.example.demo.controllers;

import com.example.demo.domain.UserDTO;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Users {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers() throws Exception {
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO User) throws Exception {
       return userServices.saveUser(User);
    }

}
