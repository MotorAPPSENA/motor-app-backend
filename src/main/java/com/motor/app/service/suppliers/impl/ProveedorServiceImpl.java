package com.motor.app.service.suppliers.impl;

import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.ProveedorDto;
import com.motor.app.persistence.models.Proveedor;
import com.motor.app.persistence.repository.supplier.ProveedorRepository;
import com.motor.app.service.suppliers.ProveedorService;
import com.motor.app.util.message.MessageEnum;
import lombok.RequiredArgsConstructor;

/*
 * 
 */
@Service
@RequiredArgsConstructor
class ProveedorServiceImpl implements ProveedorService {

  private final ProveedorRepository proveedorRepository;

  @Override
  @Transactional
  public ResponseService<Proveedor> crearProveedor(ProveedorDto suppliersDto) {

    var supplier = proveedorRepository.findByIdentifier(suppliersDto.getIdentifier());

    if (Objects.nonNull(supplier)) {
      var message =
          String.format(MessageEnum.SUPPLIER_ALREADY_EXIST.getMessage(), supplier.getIdentifier());
      throw new GlobalException(MessageEnum.SUPPLIER_ALREADY_EXIST.getCode(), message);
    }

    var supplierToSave = new Proveedor();
    supplierToSave.setSupplierId(suppliersDto.getSupplierId());
    supplierToSave.setSupplierName(suppliersDto.getSupplierName());
    supplierToSave.setSupplierAddrest(suppliersDto.getSupplierAddrest());
    supplierToSave.setCitySuppliers(suppliersDto.getCitySuppliers());
    supplierToSave.setCountrySuppliers(suppliersDto.getCountrySuppliers());
    supplierToSave.setPhoneSuppliers(suppliersDto.getPhoneSuppliers());
    supplierToSave.setEmailSuppliers(suppliersDto.getEmailSuppliers());
    supplierToSave.setIdentifier(suppliersDto.getIdentifier());
    proveedorRepository.save(supplierToSave);

    return new ResponseService<>(HttpStatus.OK.name(), MessageEnum.SUCCESSFULLY.getMessage(),
        supplierToSave);
  }

  /*
   * 
   */

  @Override
  public ResponseService<Proveedor> actualizarProveedor(Long idSupplier, ProveedorDto suppliersDto) {

    /*
     * en la siguiente funcion primero se buscara el proveedor por id, si existe se actualiza con la
     * información del supplierDto, si no existe lanza la excepcion con el objeto GlobalException
     * que es capturada por la clase Handler asi nos permitira mostrar el
     * mensaje"SUPPLIER_NOT_FOUND"el cual guarda el mensaje en el enum MessageEnum.java
     */

    var findSupplier = proveedorRepository.findById(idSupplier)
        .orElseThrow(() -> new GlobalException(MessageEnum.SUPPLIER_NOT_FOUND.getCode(),
            MessageEnum.SUPPLIER_NOT_FOUND.getMessage()));

    /*
     * Settear los valores del Dto al objeto encontrado (findSupplier-modelo)
     */

    findSupplier.setSupplierId(idSupplier);
    findSupplier.setSupplierName(suppliersDto.getSupplierName());
    findSupplier.setSupplierAddrest(suppliersDto.getSupplierAddrest());
    findSupplier.setCitySuppliers(suppliersDto.getCitySuppliers());
    findSupplier.setCountrySuppliers(suppliersDto.getCountrySuppliers());
    findSupplier.setPhoneSuppliers(suppliersDto.getPhoneSuppliers());
    findSupplier.setEmailSuppliers(suppliersDto.getEmailSuppliers());
    findSupplier.setIdentifier(suppliersDto.getIdentifier());

    /*
     * se envia el objeto entidad a la base de datos para la insercion
     */
    proveedorRepository.save(findSupplier);

    /*
     * Retorna el estado de la actualizacion con un 200 OK, Un mensaje ilustrativo y el objeto
     * actulizado
     */
    return new ResponseService<>(String.valueOf(HttpStatus.OK.value()), "!Actualización exitosa",
        findSupplier);
  }

  @Override
  public ResponseService<ProveedorDto> eliminarProveedor(Long idSupplier) {

    return null;
  }

}
