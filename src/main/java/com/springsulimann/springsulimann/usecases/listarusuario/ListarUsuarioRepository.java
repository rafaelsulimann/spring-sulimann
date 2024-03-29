package com.springsulimann.springsulimann.usecases.listarusuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.springsulimann.springsulimann.models.Usuario;

@Repository
public interface ListarUsuarioRepository extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario>{

}
