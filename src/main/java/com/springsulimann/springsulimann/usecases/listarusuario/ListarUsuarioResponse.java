package com.springsulimann.springsulimann.usecases.listarusuario;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springsulimann.springsulimann.enums.TipoUsuario;
import com.springsulimann.springsulimann.models.Usuario;

import lombok.Getter;

@Getter
public class ListarUsuarioResponse {

  private Long id;
  private String nome;
  private String email;
  private Long telefone;
  private String documento;
  private TipoUsuario tipo;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  private LocalDateTime dataCriacao;

  public ListarUsuarioResponse(Usuario usuario) {
    this.id = usuario.getId();
    this.nome = usuario.getNome();
    this.email = usuario.getEmail();
    this.telefone = usuario.getTelefone();
    this.documento = usuario.getDocumento();
    this.tipo = usuario.getTipo();
    this.dataCriacao = usuario.getDataCriacao();
  }

}
