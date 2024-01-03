package com.hucs.webapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private JwtManager jwtManager;

    public String login(LoginRequest loginRequest) {
        boolean valid = true;
        if(valid){
            return jwtManager.generateToken(loginRequest.getUsername());
        } else {
            throw new RuntimeException("Usuário inválido");
        }
    }
}
