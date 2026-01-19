package com.helalferrari.subscribeEvents.controller;

import com.helalferrari.subscribeEvents.model.User;
import com.helalferrari.subscribeEvents.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.status(201).body(service.addUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getUserById(id));
    }
    @GetMapping("/users/search")
    public ResponseEntity<User> getByEmail(@RequestParam(name = "email") String email){
        return ResponseEntity.ok(service.getUserByEmail(email));
    }

}
