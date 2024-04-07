package com.motor.app.service.product.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.motor.app.persistence.dto.ResponseService;
import com.motor.app.persistence.dto.product.ProductDto;
import com.motor.app.service.product.ProductService;
import lombok.RequiredArgsConstructor;

/*
 * 
 */
@Service
@RequiredArgsConstructor
class ProductServiceImpl implements ProductService {


  @Override
  public ResponseService<ProductDto> crearProducto(ProductDto productDto, byte[] image) {

    productDto.setProductImage(image);



    return null;
  }

  @Override
  public ResponseService<List<ProductDto>> obtenerProductos() {
    return null;
  }

  @Override
  public ResponseService<ProductDto> actualizarProducto(Long idProducto, ProductDto productDto) {
    return null;
  }

  @Override
  public ResponseService<String> eliminarProducto(Long idProducto) {
    return null;
  }
}
