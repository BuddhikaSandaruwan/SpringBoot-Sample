package com.example.demo.services.impl;

import com.example.demo.domain.UserDTO;
import com.example.demo.repository.UserRepo;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;
    @Override
    public List<UserDTO> findAllUsers()throws Exception {
        List<UserDTO> all = userRepo.findAll();
        return all;
    }

    @Override
    public String saveUser(UserDTO user) throws Exception{
        UserDTO save = userRepo.save(user);
        return "Data save";
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteUser(int userId) throws Exception {
        return false;
    }
}
