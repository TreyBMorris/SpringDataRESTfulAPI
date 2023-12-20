package com.example.springapi.controller;


import com.example.springapi.model.User;
import com.example.springapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user)
    {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers()
    {
       return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{name}")
    public ResponseEntity getUserByName(@PathVariable String name) {
        return ResponseEntity.ok(userService.getUserByName(name));
    }

    @DeleteMapping("/{_id}")
    public ResponseEntity deleteUser(@PathVariable String _id)
    {
        userService.deleteUser(_id);
        return ResponseEntity.noContent().build();
    }

}
