package com.FabricaDeSoftware.testeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FabricaDeSoftware.testeSpring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
