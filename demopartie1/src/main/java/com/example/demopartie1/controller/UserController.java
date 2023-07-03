package com.example.demopartie1.controller;

import com.example.demopartie1.entity.User;
import com.example.demopartie1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


//Un controller avec de la dette technique
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") String id, @RequestParam("details") boolean details) {
        Optional<User> userOptional = userRepository.findById(Long.parseLong(id));

        if(userOptional.isPresent()) {
            User user = userOptional.get();
            if(details) {
                return ResponseEntity.ok(getUserDetails(user));
            } else {
                return ResponseEntity.ok(user);
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    private User getUserDetails(User user) {
        //Get Detail
        return user;
    }
}
