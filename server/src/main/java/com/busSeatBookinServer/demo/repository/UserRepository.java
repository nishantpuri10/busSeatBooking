package com.busSeatBookinServer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busSeatBookinServer.demo.model.User;
import java.util.Optional;



public interface UserRepository extends JpaRepository<User,Long>{

    ///to get user by email
    Optional<User>  findByEmail(String email);

    ///to check whether user exists by email
    Boolean existsByEmail(String email);
    
}
