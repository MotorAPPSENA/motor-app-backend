package com.motor.app.persistence.models;

import java.time.LocalDate;
import java.util.Arrays;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * 
 */
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

  @Column(name = "product_image")
  private byte[] productImage;

  @Column(name = "technical_specifications")
  private String technicalSpecifications;

  @Column(name = "mtr_brand_id")
  private Long brandId;

  public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Integer getCategoryProduct() {
    return categoryProduct;
  }

  public void setCategoryProduct(Integer categoryProduct) {
    this.categoryProduct = categoryProduct;
  }

  public Double getPriceProduct() {
    return priceProduct;
  }

  public void setPriceProduct(Double priceProduct) {
    this.priceProduct = priceProduct;
  }

  public Long getQuantityInStock() {
    return quantityInStock;
  }

  public void setQuantityInStock(Long quantityInStock) {
    this.quantityInStock = quantityInStock;
  }

  public String getWarehouseLocation() {
    return warehouseLocation;
  }

  public void setWarehouseLocation(String warehouseLocation) {
    this.warehouseLocation = warehouseLocation;
  }

  public Long getSupplierProduct() {
    return supplierProduct;
  }

  public void setSupplierProduct(Long supplierProduct) {
    this.supplierProduct = supplierProduct;
  }

  public LocalDate getEntryDateProduct() {
    return entryDateProduct;
  }

  public void setEntryDateProduct(LocalDate entryDateProduct) {
    this.entryDateProduct = entryDateProduct;
  }

  public String getDescriptionProduct() {
    return descriptionProduct;
  }

  public void setDescriptionProduct(String descriptionProduct) {
    this.descriptionProduct = descriptionProduct;
  }

  public byte[] getProductImage() {
    return productImage;
  }

  public void setProductImage(byte[] productImage) {
    this.productImage = productImage;
  }

  public String getTechnicalSpecifications() {
    return technicalSpecifications;
  }

  public void setTechnicalSpecifications(String technicalSpecifications) {
    this.technicalSpecifications = technicalSpecifications;
  }

  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  @Override
  public String toString() {
    return "Products [idProduct=" + idProduct + ", productName=" + productName
        + ", categoryProduct=" + categoryProduct + ", priceProduct=" + priceProduct
        + ", quantityInStock=" + quantityInStock + ", warehouseLocation=" + warehouseLocation
        + ", supplierProduct=" + supplierProduct + ", entryDateProduct=" + entryDateProduct
        + ", descriptionProduct=" + descriptionProduct + ", productImage="
        + Arrays.toString(productImage) + ", technicalSpecifications=" + technicalSpecifications
        + ", brandId=" + brandId + "]";
  }
}
