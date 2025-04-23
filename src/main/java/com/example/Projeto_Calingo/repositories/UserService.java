package com.example.Projeto_Calingo.repositories;

import com.example.Projeto_Calingo.user.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(String id);
}
