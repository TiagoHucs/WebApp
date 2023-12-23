package com.hucs.webapp.core.repositories;

import com.hucs.webapp.core.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoy extends JpaRepository<Usuario, Long> {
}
