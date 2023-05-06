package com.CHSCombine.API.controller;

import com.CHSCombine.API.entity.User;
import com.CHSCombine.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
@Autowired
    private UserService service;


    @PostMapping("/addUser")
    public User addProduct(@RequestBody User User) {
        return service.saveUser(User);
    }


    @GetMapping("/users")
    public List<User> findAllProducts() {
        return service.getUsers();
    }

    @GetMapping("/UserById/{id}")
    public User findProductById(@PathVariable int id) {
        return service.getUserById(id);
    }


    @GetMapping("/UserByName/{name}")
    public User findProductByName(@PathVariable String name) {
        return service.getUserByName(name);
    }



}
