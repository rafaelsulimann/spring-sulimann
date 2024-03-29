package com.springsulimann.springsulimann.usecases.listarusuario;

import org.springframework.data.jpa.domain.Specification;

import com.springsulimann.springsulimann.models.Usuario;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;

@And({
  @Spec(path = "nome", spec = LikeIgnoreCase.class),
  @Spec(path = "email", spec = LikeIgnoreCase.class),
  @Spec(path = "documento", spec = Equal.class),
})
public interface ListarUsuarioSpecification extends Specification<Usuario>{}
