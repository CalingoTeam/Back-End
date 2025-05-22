package com.example.Projeto_Calingo.repositories;

import com.example.Projeto_Calingo.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> getUsers();
    User getUser(String id);
}
