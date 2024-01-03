package com.hucs.webapp.core.controllers;

import com.hucs.webapp.core.controllers.vo.UsuarioVO;
import com.hucs.webapp.core.entities.Usuario;
import com.hucs.webapp.core.services.UsuarioService;
import com.hucs.webapp.security.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hucs.webapp.core.controllers.mappers.UsuarioMapper.map;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

   @GetMapping(value = "/listar")
   public List<UsuarioVO> listar(){
       return map(usuarioService.listar());
   }

    @PostMapping(value = "/criar")
    public void salvar(@RequestBody LoginRequest signUpRequest){
        usuarioService.criar(signUpRequest);
    }

}
