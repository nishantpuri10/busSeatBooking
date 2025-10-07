package com.busSeatBookinServer.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.busSeatBookinServer.demo.model.User;
import com.busSeatBookinServer.demo.repository.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    ///Signup logic
    public User signup(User user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("User already exists");
        }
        return userRepository.save(user);
    }

    ///Login logic
    public User loginUser(String email , String password){
        if(!(userRepository.existsByEmail(email))){
            throw new RuntimeException("User not found");
        }
        User user = userRepository.findByEmail(email).get();
        if(user.getPassword().equals(password)){
            return user;
        }
        throw new RuntimeException("Invalid password");
    }
    
}
