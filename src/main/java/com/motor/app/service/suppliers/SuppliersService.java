package com.motor.app.service.suppliers;

import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.SuppliersDto;
import com.motor.app.persistence.models.Suppliers;

/*
 * 
 */
public interface SuppliersService {

  ResponseService<Suppliers> createSupplier(SuppliersDto suppliersDto);

  ResponseService<SuppliersDto> updateSupplier(Long idSupplier, SuppliersDto suppliersDto);

  ResponseService<SuppliersDto> deleteSupplier(Long idSupplier);
}
