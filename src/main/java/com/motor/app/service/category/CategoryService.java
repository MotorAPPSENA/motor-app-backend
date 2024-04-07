package com.motor.app.service.category;

import java.util.List;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.category.CategoryDto;

/*
 * Permite manejar la abstaccion de los metodos de la logica
 */
public interface CategoryService {

  ResponseService<List<CategoryDto>> listarCategorias();

  ResponseService<CategoryDto> crearCategoria(CategoryDto categoryDto);

  ResponseService<CategoryDto> actualizarCategoria(Long idCategoria, CategoryDto categoryDto);

  ResponseService<String> eliminarCategoria(Long idCategoria);
}
