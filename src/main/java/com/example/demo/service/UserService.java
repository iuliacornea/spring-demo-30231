package com.example.demo.service;

import com.example.demo.dto.UserCreateDTO;
import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {

    UserDTO registerUser(UserCreateDTO dto);
}
