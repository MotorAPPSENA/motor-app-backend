package com.motor.app.service.category.impl;

import java.util.List;
import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.motor.app.exception.GlobalException;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.category.CategoryDto;
import com.motor.app.persistence.models.Categories;
import com.motor.app.persistence.repository.category.CategoriesRepository;
import com.motor.app.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * 
 */
@Slf4j
@Service
@RequiredArgsConstructor
class CategoryServiceImpl implements CategoryService {

  private final CategoriesRepository categoriesRepository;


  /*
   * Este metodo me permite obtener la lista de las categorias registradas en la db
   */
  @Override
  public ResponseService<List<CategoryDto>> listarCategorias() {

    log.info("Init method getAll");

    // Se obtienen las categorias
    var listEntities = categoriesRepository.findAll();

    // se valida si la lista es vacia
    if (listEntities.isEmpty()) {
      throw new GlobalException(200, "No hay categorias por mostrar");
    }

    // se mapea desde la lista de entidades a la lista dto
    var listCategoriesDto =
        listEntities.stream().map(categoria -> new CategoryDto(categoria.getCategoryId(),
            categoria.getCategoryName(), categoria.getCategoryDescription())).toList();

    return new ResponseService<>(HttpStatus.OK.getReasonPhrase(), "Consulta realizada con exito",
        listCategoriesDto);
  }

  /*
   * 
   */
  @Override
  public ResponseService<CategoryDto> crearCategoria(CategoryDto categoryDto) {


    // se hacer la consulta a la base de datos, si existe el nombre de la categoria
    var category =
        categoriesRepository.findByCategoryName(categoryDto.getCategoryName().toUpperCase());

    if (Objects.nonNull(category)) {
      var message = "La categoria %s ya existe";
      throw new GlobalException(400, String.format(message, categoryDto.getCategoryName()));
    }

    var categoryEntity = new Categories();
    categoryEntity.setCategoryName(categoryDto.getCategoryName());
    categoryEntity.setCategoryDescription(categoryDto.getCategoryDescription());

    var entity = categoriesRepository.save(categoryEntity);
    log.info("Guardado con exito");
    categoryDto.setCategoryId(entity.getCategoryId());

    return new ResponseService<>(HttpStatus.CREATED.name(), "Guardado con exito", categoryDto);
  }

  @Override
  public ResponseService<CategoryDto> actualizarCategoria(Long idCategoria,
      CategoryDto categoryDto) {

    var entity = categoriesRepository.findById(idCategoria)
        .orElseThrow(() -> new GlobalException(404, "!No existe esta categoria!"));

    entity.setCategoryId(idCategoria);
    entity.setCategoryName(categoryDto.getCategoryName());
    entity.setCategoryDescription(categoryDto.getCategoryDescription());
    categoriesRepository.save(entity);

    log.info("Actualizado con exito");
    return new ResponseService<>(HttpStatus.OK.name(), "!Actualizado con exito!", categoryDto);
  }

  @Override
  public ResponseService<String> eliminarCategoria(Long idCategoria) {

    var entidad = categoriesRepository.findById(idCategoria)
        .orElseThrow(() -> new GlobalException(404, "!No existe esta categoria!"));

    log.info("Eliminacion exitosa de la categoria {} ", entidad.getCategoryName());

    categoriesRepository.deleteById(idCategoria);

    return new ResponseService<>(HttpStatus.OK.name(), "Eliminación exitosa",
        HttpStatus.OK.getReasonPhrase());
  }

}
