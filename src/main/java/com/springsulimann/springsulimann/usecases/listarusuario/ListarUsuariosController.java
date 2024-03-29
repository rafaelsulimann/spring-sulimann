package com.springsulimann.springsulimann.usecases.listarusuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsulimann.springsulimann.utils.Path;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = Path.USUARIO)
@RequiredArgsConstructor
public class ListarUsuariosController {

  private final ListarUsuarioRepository listarUsuarioRepository;

  @GetMapping
  @Operation(summary = "Lista usuários com paginação e filtros")
  public ResponseEntity<Page<ListarUsuarioResponse>> listarUsuarios(
      @Parameter(description = "Listar Usuários Filtro", content = @Content(schema = @Schema(implementation = ListarUsuarioFiltro.class))) ListarUsuarioSpecification spec,
      @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(this.listarUsuarioRepository.findAll(spec, pageable).map(ListarUsuarioResponse::new));
  }

}
