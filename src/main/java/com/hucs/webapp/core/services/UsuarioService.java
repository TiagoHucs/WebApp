package com.hucs.webapp.core.services;

import com.hucs.webapp.core.entities.Usuario;
import com.hucs.webapp.core.repositories.UsuarioRepositoy;
import com.hucs.webapp.security.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositoy usuarioRepositoy;

    public List<Usuario> listar() {
        return usuarioRepositoy.findAll();
    }

    public void criar(LoginRequest signUpRequest) {
        if (obter(signUpRequest.getUsername()).isPresent()) {
            throw new RuntimeException("usuario ja cadastrado");
        } else {
            usuarioRepositoy.save(Usuario.builder()
                    .username(signUpRequest.getUsername())
                    .password(signUpRequest.getPassword())
                    .build());
        }
    }

    public Optional<Usuario> obter(String username) {
        Usuario example = Usuario.builder().username(username).build();
        return usuarioRepositoy.findOne(Example.of(example));
    }
}
