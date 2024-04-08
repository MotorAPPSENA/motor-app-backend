package com.motor.app.controller.suppliers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.ProveedorDto;
import com.motor.app.persistence.models.Proveedor;
import com.motor.app.service.suppliers.ProveedorService;
import com.motor.app.util.validation.ValidacionDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*
 * Capa de presentacion para Proveedores
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/suppliers")
class SuppliersController {

  private final ProveedorService proveedorService;

  /**
   * Metodo para registrar un proveedor
   * 
   * @param suppliersDto -> Objeto con la Data a registrar
   * @param bindingResult -> Captura las restricciones de las validaciones
   * @return Retorna el objeto indicando registro exitoso
   */
  @PostMapping(path = "register", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<Proveedor>> createSupplier(
      @Valid @RequestBody ProveedorDto suppliersDto, BindingResult bindingResult) {


    ValidacionDto.validarObjeto(bindingResult);
    var response = proveedorService.crearProveedor(suppliersDto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }


  /**
   * Metodo que recibe la peticion de actualizacion para los proveedores
   * 
   * @param idSupplier
   * @param suppliersDto
   * @param result
   * @return Codigo de estado, un mensaje y el objeto actualizado.
   */
  @PutMapping(path = "update/{idSupplier}", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<Proveedor>> updateSupplier(
      @PathVariable(name = "idSupplier") Long idSupplier,
      @Valid @RequestBody ProveedorDto suppliersDto, BindingResult result) {

    ValidacionDto.validarObjeto(result);
    var response = proveedorService.actualizarProveedor(idSupplier, suppliersDto);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @DeleteMapping(path = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<String>> eliminaProveedor(@PathVariable(name = "id") Long id) {

    var response = proveedorService.eliminarProveedor(id);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
