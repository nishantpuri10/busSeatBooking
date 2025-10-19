package com.busSeatBookinServer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busSeatBookinServer.demo.model.User;
import com.busSeatBookinServer.demo.service.UserService;

@RequestMapping("api/v1/users")
@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    
    ///Signup logic
    @PostMapping("/signup")
    public ResponseEntity<User> signupUser(@RequestBody User user){
        return ResponseEntity.ok(userService.signup(user));
    }
    
    ///Login
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user){
        return ResponseEntity.ok(userService.loginUser(user.getEmail(), user.getPassword()));

    }

}
