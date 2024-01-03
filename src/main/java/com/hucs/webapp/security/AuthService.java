package com.hucs.webapp.security;

import com.hucs.webapp.core.entities.Usuario;
import com.hucs.webapp.core.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private JwtManager jwtManager;


    @Autowired
    private UsuarioService usuarioService;

    public String login(LoginRequest loginRequest) {
        Optional<Usuario> usuario = usuarioService.obter(loginRequest.getUsername());
        if(usuario.isPresent() && usuario.get().getPassword().equals(loginRequest.getPassword())){
            return jwtManager.generateToken(loginRequest.getUsername());
        } else {
            throw new RuntimeException("Usuário inválido");
        }
    }
}
