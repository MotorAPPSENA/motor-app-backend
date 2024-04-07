package com.motor.app.persistence.dto.product;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/*
 * 
 */
@Data
public class ProductDto {

  private Long idProduct;

  @NotBlank
  private String productName;

  @NotBlank
  private Integer categoryProduct;

  @NotBlank
  private Double priceProduct;

  @NotBlank
  private Long quantityInStock;

  @NotBlank
  private String warehouseLocation;

  @NotBlank
  private Long supplierProduct;

  @NotBlank
  private LocalDate entryDateProduct;

  @NotBlank
  private String descriptionProduct;

  private byte[] productImage;

  @NotBlank
  private String technicalSpecifications;

  @NotBlank
  private Long brandId;
}
