package com.motor.app.controller.brand;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.brands.BrandsDto;
import com.motor.app.service.brands.BrandsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * Controlador de Marcas, capa de presentación
 */

@Slf4j
@RequestMapping(path = "api/Marcas")
@RestController
@RequiredArgsConstructor
class BrandController {

  private final BrandsService brandsService;

  @GetMapping(path = "todos", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<List<BrandsDto>>> listaMarcas() {

    log.info("Iniciando metodo controlador obtener Marcas");

    // va al servicio a realizar la consulta de las Marcas
    var result = brandsService.listarMarcas();

    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
