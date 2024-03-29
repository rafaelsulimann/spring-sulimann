package com.springsulimann.springsulimann.usecases.incluirusuario;

import java.io.Serializable;

import com.springsulimann.springsulimann.enums.TipoUsuario;
import com.springsulimann.springsulimann.models.Usuario;
import com.springsulimann.springsulimann.utils.ErrorMessage;
import com.springsulimann.springsulimann.validators.uniquevalue.UniqueValue;
import com.springsulimann.springsulimann.validators.validenum.ValidEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class IncluirUsuarioRequest implements Serializable{

  private static final long serialVersionUID = 1L;

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  private String nome;

  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  @UniqueValue(domainClass = Usuario.class, fieldName = "email", message = "Email já existente")
  private String email;

  @NotNull(message = ErrorMessage.CAMPO_OBRIGATORIO)
  private Long telefone;

  @NotNull(message = ErrorMessage.CAMPO_OBRIGATORIO)
  @UniqueValue(domainClass = Usuario.class, fieldName = "documento", message = "Documento já existente")
  private String documento;

  @ValidEnum(enumClass = TipoUsuario.class, message = "Tipo de Usuário inválido")
  @NotBlank(message = ErrorMessage.CAMPO_OBRIGATORIO)
  private String tipo;

  public Usuario toModel() {
    return new Usuario(this.nome, this.email, this.telefone, this.documento, TipoUsuario.valueOf(this.tipo.toUpperCase()));
  }

}
