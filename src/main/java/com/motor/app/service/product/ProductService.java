package com.motor.app.service.product;

import java.util.List;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.product.ProductDto;

/*
 * 
 */
public interface ProductService {

  ResponseService<List<ProductDto>> obtenerProductos();

  ResponseService<ProductDto> crearProducto(ProductDto productDto, byte[] image);

  ResponseService<ProductDto> actualizarProducto(Long idProducto, ProductDto productDto);

  ResponseService<String> eliminarProducto(Long idProducto);
}
