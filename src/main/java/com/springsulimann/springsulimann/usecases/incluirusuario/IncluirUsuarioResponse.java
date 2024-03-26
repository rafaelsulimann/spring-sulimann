package com.springsulimann.springsulimann.usecases.incluirusuario;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springsulimann.springsulimann.enums.TipoUsuario;
import com.springsulimann.springsulimann.models.Usuario;

import lombok.Getter;

@Getter
public class IncluirUsuarioResponse {

  private Long id;
  private String nome;
  private String email;
  private Long telefone;
  private String documento;
  private TipoUsuario tipo;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  private LocalDateTime dataCriacao;

  public IncluirUsuarioResponse(Usuario entity){
    this.id = entity.getId();
    this.nome = entity.getNome();
    this.email = entity.getEmail();
    this.telefone = entity.getTelefone();
    this.documento = entity.getDocumento();
    this.tipo = entity.getTipo();
    this.dataCriacao = entity.getDataCriacao();
  }

}
