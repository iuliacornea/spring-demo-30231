package com.example.demo.service.mapper;

import com.example.demo.dto.UserCreateDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserCreateDTO dto) {
        User user = new User();
        user.email = dto.email;
        user.password = dto.password;
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.uuid = user.uuid;
        dto.email = user.email;
        dto.firstName = user.firstName;
        dto.lastName = user.lastName;
        return dto;
    }
}
