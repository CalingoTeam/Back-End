package com.example.Projeto_Calingo.controller;

import com.example.Projeto_Calingo.infra.security.TokenService;
import com.example.Projeto_Calingo.repositories.UserRepository;
import com.example.Projeto_Calingo.user.AuthenticationDTO;
import com.example.Projeto_Calingo.user.LoginResponseDTO;
import com.example.Projeto_Calingo.user.RegisterDTO;
import com.example.Projeto_Calingo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository repository;
    @Autowired
    private TokenService tokenService;


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Validated AuthenticationDTO data){
        var nicknamePassword = new UsernamePasswordAuthenticationToken(data.nickname(), data.password());
        var auth = this.authenticationManager.authenticate(nicknamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Validated RegisterDTO data){
        if(this.repository.findByNickname(data.nickname())!=null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(data.name(), data.nickname(), data.email(), encryptedPassword, data.state(), data.role());

        this.repository.save(newUser);
        return ResponseEntity.ok().build();
    }
}
