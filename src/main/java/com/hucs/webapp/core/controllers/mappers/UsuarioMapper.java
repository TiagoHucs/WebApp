package com.hucs.webapp.core.controllers.mappers;

import com.hucs.webapp.core.controllers.vo.UsuarioVO;
import com.hucs.webapp.core.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMapper {

    public static Usuario map(UsuarioVO vo){
        return Usuario.builder()
                .nome(vo.getNome())
                .build();
    }

    public static UsuarioVO map(Usuario obj){
        return UsuarioVO.builder()
                .nome(obj.getNome())
                .build();
    }

    public static List<UsuarioVO> map(List<Usuario> objList){
        List<UsuarioVO> voList = new ArrayList<>();
        for (Usuario obj: objList) {
            voList.add(map(obj));
        }
        return voList;
    }
}
