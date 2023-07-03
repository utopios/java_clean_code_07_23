package com.example.demopartie1.controller;

import com.example.demopartie1.Validator.ValidationResult;
import com.example.demopartie1.entity.User;
import com.example.demopartie1.entity.UserDetails;
import com.example.demopartie1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
                /*UserDetails userDetails = getUserDetails(user); //
                if(userDetails != null) {
                    user.setDetails(userDetails);
                    return ResponseEntity.ok(user);
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }*/
                getUserDetails(user);
                //return ResponseEntity.ok(user);
            } /*else {
                //return ResponseEntity.ok(user);
            }*/
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    private void getUserDetails(User user) {
        UserDetails userDetails = new UserDetails();//... Création des details de l'utilisateur
        if(userDetails != null) {
            user.setDetails(userDetails);
        }
    }
    /*private UserDetails getUserDetails(User user) {
        //Get Detail
        return new UserDetails();
    }*/


    /**
     * Demo LOC
     * */

    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody User user) {
        /*// vérifier le nom
        if (user.getName() == null || user.getName().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // vérifier l'email
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // vérifier l'âge
        if (user.getAge() < 0 || user.getAge() > 120) {
            return ResponseEntity.badRequest().build();
        }

        // vérifier le numéro de téléphone
        if (user.getPhoneNumber() == null || user.getPhoneNumber().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        // vérifier le pays
        if (user.getCountry() == null || user.getCountry().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        userRepository.save(user);
        return ResponseEntity.ok(user);*/

        ValidationResult validationResult = validateUser(user);
        if(validationResult.isValid()){
            userRepository.save(user);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.badRequest().body(validationResult.getErrorMessage());
    }

    public ValidationResult validateUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            return ValidationResult.builder().valid(false).errorMessage("Invalid name").build();
        }

        // vérifier l'email
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return ValidationResult.builder().valid(false).errorMessage("Invalid email").build();
        }

        // vérifier l'âge
        if (user.getAge() < 0 || user.getAge() > 120) {
            return ValidationResult.builder().valid(false).errorMessage("Invalid age").build();
        }

        // vérifier le numéro de téléphone
        if (user.getPhoneNumber() == null || user.getPhoneNumber().isEmpty()) {
            return ValidationResult.builder().valid(false).errorMessage("Invalid phonenumber").build();
        }

        // vérifier le pays
        if (user.getCountry() == null || user.getCountry().isEmpty()) {
            return ValidationResult.builder().valid(false).errorMessage("Invalid country").build();
        }
        return ValidationResult.builder().valid(true).build();
    }
}
