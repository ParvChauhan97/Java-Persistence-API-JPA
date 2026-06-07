package com.example.jpademo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userservice;
    public UserController(UserService userservice) {
        this.userservice = userservice;
    }
    
    @PostMapping
    public ResponseEntity<UserClassSpringBoot> createUser(@RequestBody UserClassSpringBoot user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userservice.create(user));
    }

    @GetMapping
    public ResponseEntity<List<UserClassSpringBoot>> getUser() {
         return ResponseEntity.status(HttpStatus.ACCEPTED).body(userservice.getAllUsers());
    }
}
