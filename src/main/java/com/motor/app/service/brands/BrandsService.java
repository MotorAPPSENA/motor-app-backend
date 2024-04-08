package com.motor.app.service.brands;

import java.util.List;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.brands.BrandsDto;

/*
 * 
 */

public interface BrandsService {

  ResponseService<List<BrandsDto>> listarMarcas();

  ResponseService<BrandsDto> crearMarca(BrandsDto brandsDto);

  ResponseService<BrandsDto> actualizarMarca(Long idMarca, BrandsDto brandsDto);

  ResponseService<String> eliminarMarca(Long idMarca);

}
