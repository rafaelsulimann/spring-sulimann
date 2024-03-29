package com.springsulimann.springsulimann.usecases.listarusuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListarUsuarioFiltro {

  private String nome;
  private String email;
  private String documento;

}
