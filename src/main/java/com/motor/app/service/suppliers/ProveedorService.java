package com.motor.app.service.suppliers;

import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.ProveedorDto;
import com.motor.app.persistence.models.Proveedor;

/*
 * 
 */
public interface ProveedorService {

  ResponseService<Proveedor> crearProveedor(ProveedorDto suppliersDto);

  ResponseService<Proveedor> actualizarProveedor(Long idSupplier, ProveedorDto suppliersDto);

  ResponseService<ProveedorDto> eliminarProveedor(Long idSupplier);
}
