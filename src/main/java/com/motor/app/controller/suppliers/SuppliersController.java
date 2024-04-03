package com.motor.app.controller.suppliers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.SuppliersDto;
import com.motor.app.persistence.models.Suppliers;
import com.motor.app.service.suppliers.SuppliersService;
import com.motor.app.util.validation.ValidationDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*
 * 
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/suppliers")
class SuppliersController {

  private final SuppliersService suppliersService;

  /*
   * 
   */
  @PostMapping(path = "register", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<ResponseService<Suppliers>> createSupplier(
      @Valid @RequestBody SuppliersDto suppliersDto, BindingResult bindingResult) {

    ValidationDto.validateObject(bindingResult);
    var response = suppliersService.createSupplier(suppliersDto);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }
}
