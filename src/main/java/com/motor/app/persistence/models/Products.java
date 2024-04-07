package com.motor.app.persistence.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

/*
 * 
 */
@Data
@Entity
@Table(name = "products")
public class Products {

  @Id
  @Column(name = "mtr_product_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProduct;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "category_product")
  private Integer categoryProduct;

  @Column(name = "price_product")
  private Double priceProduct;

  @Column(name = "quantity_in_stock")
  private Long quantityInStock;

  @Column(name = "warehouse_location")
  private String warehouseLocation;

  @Column(name = "supplier_product")
  private Long supplierProduct;

  @Column(name = "entry_date_product")
  private LocalDate entryDateProduct;

  @Column(name = "description_product")
  private String descriptionProduct;

  @Lob
  @Column(name = "product_image")
  private byte[] productImage;

  @Column(name = "technical_specifications")
  private String technicalSpecifications;

  @Column(name = "mtr_brand_id")
  private Long brandId;
}
