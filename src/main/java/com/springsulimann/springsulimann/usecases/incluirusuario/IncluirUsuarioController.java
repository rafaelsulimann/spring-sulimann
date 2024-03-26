package com.springsulimann.springsulimann.usecases.incluirusuario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsulimann.springsulimann.models.Usuario;
import com.springsulimann.springsulimann.utils.Path;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = Path.USUARIO)
public class IncluirUsuarioController {

  @PersistenceContext
  private EntityManager manager;

  @PostMapping
  @Transactional
  public ResponseEntity<IncluirUsuarioResponse> incluirUsuario(@RequestBody @Valid IncluirUsuarioRequest request){
    Usuario usuario = request.toModel();
    this.manager.persist(usuario);
    return ResponseEntity.status(HttpStatus.CREATED).body(new IncluirUsuarioResponse(usuario));
  }

}
