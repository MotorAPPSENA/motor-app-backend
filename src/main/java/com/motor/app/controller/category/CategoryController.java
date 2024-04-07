package com.motor.app.controller.category;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.category.CategoryDto;
import com.motor.app.service.category.CategoryService;
import com.motor.app.util.validation.ValidacionDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * Controlador de las categorias, capa de presentación
 */
@Slf4j
@RequestMapping(path = "api/categories")
@RestController()
@RequiredArgsConstructor
class CategoryController {

  private final CategoryService categoryService;

  /**
   * Metodo que recibe la peticion para listar todas las categorias
   * 
   * @return la lista de las categorias existentes
   */
  @GetMapping(path = "todas", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<List<CategoryDto>>> listarCategorias() {

    log.info("Iniciando el método controlador de obtener categorias");

    // va al servicio a realizar la consulta de las categorias
    var result = categoryService.listarCategorias();

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  /**
   * Metodo que recibe la peticion para crear una nueva categoria
   * 
   * @param categoryDto -> datos a insertar
   * @param bindingResult -> si tiene alguna violacion de restricciones
   * @return la informacion de la categoria insertada
   */
  @PostMapping(path = "registrar", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<CategoryDto>> crearCategoria(
      @Valid @RequestBody CategoryDto categoryDto, BindingResult bindingResult) {

    log.info("Iniciando el método controlador para crear una categoria");

    ValidacionDto.validarObjeto(bindingResult);

    var result = categoryService.crearCategoria(categoryDto);

    return new ResponseEntity<>(result, HttpStatus.CREATED);
  }

  /*
   * 
   */
  @PutMapping(path = "actualizar/{idCategoria}", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<CategoryDto>> actualizarCategoria(
      @PathVariable(name = "idCategoria") Long idCategoria,
      @Valid @RequestBody CategoryDto categoryDto, BindingResult bindingResult) {

    ValidacionDto.validarObjeto(bindingResult);

    var result = categoryService.actualizarCategoria(idCategoria, categoryDto);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  /*
   * 
   */
  @DeleteMapping(path = "eliminar/{idCategoria}", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> eliminarCategoria(
      @PathVariable(name = "idCategoria") Long idCategoria) {

    var result = categoryService.eliminarCategoria(idCategoria);

    return new ResponseEntity<>(result, HttpStatus.OK);

  }
}
