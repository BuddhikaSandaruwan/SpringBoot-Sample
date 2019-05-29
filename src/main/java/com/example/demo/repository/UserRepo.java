package com.example.demo.repository;

import com.example.demo.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDTO,Integer> {
}
