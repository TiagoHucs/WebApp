package com.hucs.webapp.core.controllers;

import com.hucs.webapp.core.entities.Usuario;
import com.hucs.webapp.core.repositories.UsuarioRepositoy;
import com.hucs.webapp.core.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

   @GetMapping(value = "/listar")
   public List<Usuario> listar(){
       return usuarioService.listar();
   }

}
