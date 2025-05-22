package com.example.Projeto_Calingo.repositories;

import com.example.Projeto_Calingo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByNickname(String nickname);
}
