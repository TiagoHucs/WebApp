package com.hucs.webapp.core.services;

import com.hucs.webapp.core.entities.Usuario;
import com.hucs.webapp.core.repositories.UsuarioRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositoy usuarioRepositoy;

    public List<Usuario> listar(){
        return usuarioRepositoy.findAll();
    }
}
