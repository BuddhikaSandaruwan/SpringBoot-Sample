package com.example.demo.services;

import com.example.demo.domain.UserDTO;

import java.util.List;

public interface UserServices {

    public List<UserDTO> findAllUsers()throws Exception;

    public String saveUser(UserDTO userDTO)throws Exception;

    public boolean updateUser(UserDTO userDTO)throws Exception;

    public boolean deleteUser(int userId)throws Exception;

}
