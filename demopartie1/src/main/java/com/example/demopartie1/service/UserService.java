package com.example.demopartie1.service;

import com.example.demopartie1.entity.User;
import com.example.demopartie1.repository.RoleRepository;
import com.example.demopartie1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    /*@Autowired
    private RoleRepository roleRepository;*/
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /*public void createRole() {
        //....
    }*/
}
