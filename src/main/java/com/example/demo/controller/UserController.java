package com.example.demo.controller;

import com.example.demo.dto.UserCreateDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // REST controller
    // GET /resource/{id} - get the resource with id
    // POST /resource (includes the resource data in the body) -create a new resource
    // PUT /resource/{id} - update the resource with id
    // DELETE /resource/{id} - delete the resource with given id

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @Autowired
//    UserService userService;

    @PostMapping("/user")
    ResponseEntity<UserDTO> registerUser(@RequestBody UserCreateDTO dto) {
        UserDTO registeredUser = userService.registerUser(dto);
        return ResponseEntity.ok(registeredUser);
    }

}
