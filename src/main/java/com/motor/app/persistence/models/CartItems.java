package com.motor.app.persistence.models;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/*
 * 
 */

@Table
@Entity(name="cartItems")
public class CartItems {

  
 @Column(name="mtr_item_id")
 private Long itemId;
 
 @Column(name="mtr_car_id_fk")
 private Long carId;
 
 @Column(name="mtr_id_product_fk")
 private Long idProduct;
 
 @Column (name="mtr_quantity_item")
  private Long quantityItem;
 
 @Column (name="mtr_subtotal_item")
 private Double subtotalItem;
 
 @Column (name="mtr_status_item_fk")
 private Long StatusItem;
 
 @Column (name="mtr_added_date")
 private LocalDateTime addedDate;

public CartItems(Long itemId, Long carId, Long idProduct, Long quantityItem, Double subtotalItem,
    Long statusItem, LocalDateTime addedDate) {
  super();
  this.itemId = itemId;
  this.carId = carId;
  this.idProduct = idProduct;
  this.quantityItem = quantityItem;
  this.subtotalItem = subtotalItem;
  StatusItem = statusItem;
  this.addedDate = addedDate;
}

public Long getItemId() {
  return itemId;
}

public void setItemId(Long itemId) {
  this.itemId = itemId;
}

public Long getCarId() {
  return carId;
}

public void setCarId(Long carId) {
  this.carId = carId;
}

public Long getIdProduct() {
  return idProduct;
}

public void setIdProduct(Long idProduct) {
  this.idProduct = idProduct;
}

public Long getQuantityItem() {
  return quantityItem;
}

public void setQuantityItem(Long quantityItem) {
  this.quantityItem = quantityItem;
}

public Double getSubtotalItem() {
  return subtotalItem;
}

public void setSubtotalItem(Double subtotalItem) {
  this.subtotalItem = subtotalItem;
}

public Long getStatusItem() {
  return StatusItem;
}

public void setStatusItem(Long statusItem) {
  StatusItem = statusItem;
}

public LocalDateTime getAddedDate() {
  return addedDate;
}

public void setAddedDate(LocalDateTime addedDate) {
  this.addedDate = addedDate;
}

@Override
public String toString() {
  return "CartItems [itemId=" + itemId + ", carId=" + carId + ", idProduct=" + idProduct
      + ", quantityItem=" + quantityItem + ", subtotalItem=" + subtotalItem + ", StatusItem="
      + StatusItem + ", addedDate=" + addedDate + "]";
}

 
}

