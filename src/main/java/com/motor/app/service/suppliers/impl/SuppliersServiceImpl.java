package com.motor.app.service.suppliers.impl;

import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.supplier.SuppliersDto;
import com.motor.app.persistence.models.Suppliers;
import com.motor.app.persistence.repository.supplier.SuppliersRepository;
import com.motor.app.service.suppliers.SuppliersService;
import com.motor.app.util.message.MessageEnum;
import lombok.RequiredArgsConstructor;

/*
 * 
 */
@Service
@RequiredArgsConstructor
class SuppliersServiceImpl implements SuppliersService {

  private final SuppliersRepository suppliersRepository;

  @Override
  public ResponseService<Suppliers> createSupplier(SuppliersDto suppliersDto) {

    var supplier = suppliersRepository.findByIdentifier(suppliersDto.getIdentifier());

    if (Objects.nonNull(supplier)) {
      var message =
          String.format(MessageEnum.SUPPLIER_ALREADY_EXIST.getMessage(), supplier.getIdentifier());
      throw new GlobalException(MessageEnum.SUPPLIER_ALREADY_EXIST.getCode(), message);
    }

    var supplierToSave = new Suppliers();
    supplierToSave.setSupplierId(suppliersDto.getSupplierId());
    supplierToSave.setSupplierName(suppliersDto.getSupplierName());
    supplierToSave.setSupplierAddrest(suppliersDto.getSupplierAddrest());
    supplierToSave.setCitySuppliers(suppliersDto.getCitySuppliers());
    supplierToSave.setCountrySuppliers(suppliersDto.getCountrySuppliers());
    supplierToSave.setPhoneSuppliers(suppliersDto.getPhoneSuppliers());
    supplierToSave.setEmailSuppliers(suppliersDto.getEmailSuppliers());
    supplierToSave.setIdentifier(suppliersDto.getIdentifier());
    suppliersRepository.save(supplierToSave);

    return new ResponseService<>(HttpStatus.CREATED.name(), MessageEnum.SUCCESSFULLY.getMessage(),
        supplierToSave);
  }

  @Override
  public ResponseService<SuppliersDto> updateSupplier(Long idSupplier, SuppliersDto suppliersDto) {

    return null;
  }

  @Override
  public ResponseService<SuppliersDto> deleteSupplier(Long idSupplier) {

    return null;
  }

}
