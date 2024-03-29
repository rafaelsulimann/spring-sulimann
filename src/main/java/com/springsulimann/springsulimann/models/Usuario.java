package com.springsulimann.springsulimann.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springsulimann.springsulimann.enums.TipoUsuario;
import com.springsulimann.springsulimann.utils.TableName;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = TableName.USUARIOS)
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private Long telefone;
  private String documento;

  @Enumerated(EnumType.STRING)
  private TipoUsuario tipo;

  @CreatedDate
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  private LocalDateTime dataCriacao;

  public Usuario(){
  }

  public Usuario(String nome, String email, Long telefone, String documento, TipoUsuario tipo) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.documento = documento;
    this.tipo = tipo;
  }

}
