package com.example.Projeto_Calingo.services.impl;

import com.example.Projeto_Calingo.repositories.UserRepository;
import com.example.Projeto_Calingo.repositories.UserService;
import com.example.Projeto_Calingo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                "id invalido " + id));
        return user;
    }
}
