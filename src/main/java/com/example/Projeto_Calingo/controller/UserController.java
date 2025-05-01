package com.example.Projeto_Calingo.controller;

import com.example.Projeto_Calingo.repositories.UserService;
import com.example.Projeto_Calingo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/get")
    public User getUser(@RequestParam String id){
        return userService.getUser(id);
    }
}
