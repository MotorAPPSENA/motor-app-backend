package com.motor.app.service.brands.impl;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.brands.BrandsDto;
import com.motor.app.persistence.repository.brands.BrandsRepository;
import com.motor.app.service.brands.BrandsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * Implementacion del Servicio
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BrandsServiceImpl implements BrandsService {

  private final BrandsRepository brandsRepository;

  /*
   * Este metodo me permite obtener la lista de las marcas registradas en la db
   */
  @Override
  public ResponseService<List<BrandsDto>> listarMarcas() {

    log.info("metodo de inicio obtener todas las marcas");

    // Se obtienen todas las categorias
    var listEntities = brandsRepository.findAll();

    // si la variable listEntities esta vacia -> envia la excepcion solicitada!
    if (listEntities.isEmpty()) {
      throw new GlobalException(200, "No hay marcas para mostrar!");
    }

    // se mapea desde la lista de entidades a objeto Dto
    var listBrandsDto = listEntities.stream()
        .map(marca -> new BrandsDto(marca.getBrandId(), marca.getBrandName(),
            marca.getCountryOriginBrand(), marca.getFoundingYearBrand(), marca.getWebSiteBrand(),
            marca.getDescriptionBrand(), marca.getLogouUrl()))
        .toList();


    return new ResponseService<>(HttpStatus.OK.getReasonPhrase(), "Consulta realizada con exito",
        listBrandsDto);
  }

  @Override
  public ResponseService<BrandsDto> crearMarca(BrandsDto brandsDto) {
    return null;
  }

  @Override
  public ResponseService<BrandsDto> actualizarMarca(Long idMarca, BrandsDto brandsDto) {
    return null;
  }

  @Override
  public ResponseService<String> eliminarMarca(Long idMarca) {
    return null;
  }

}
