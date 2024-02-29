package com.motor.app.persistence.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
@Table(name = "shipping")
public class Shipping {

  @Id
  @Column(name = "mtr_shipping_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long shippingId;

  @Column(name = "mtr_shipping_transaction_id_fk")
  private Long shippingTransactionId;

  @Column(name = "mtr_shipping_customer_id_fk")
  private Long shippingCustomerId;

  @Column(name = "mtr_shipping_addrest")
  private String shippingAddrest;

  @Column(name = "mtr_shipping_date")
  private LocalDateTime shippingDate;

  @Column(name = "mtr_shipping_company")
  private String shippingCompany;

  @Column(name = "mtr_tracking_number")
  private String trackingNumber;

  @Column(name = "mtr_shipping_status")
  private Integer shippingStatus;

  @Column(name = "mtr_delivery_date")
  private LocalDate deliveryDate;

  @Column(name = "mtr_shipping_cost")
  private Double shippingCost;

  @Column(name = "mtr_shipping_notes")
  private String shippingNotes;

 
 
  public Shipping(Long shippingId, Long shippingTransactionId, Long shippingCustomerId,
      String shippingAddrest, LocalDateTime shippingDate, String shippingCompany,
      String trackingNumber, Integer shippingStatus, LocalDate deliveryDate, Double shippingCost,
      String shippingNotes) {
    super();
    this.shippingId = shippingId;
    this.shippingTransactionId = shippingTransactionId;
    this.shippingCustomerId = shippingCustomerId;
    this.shippingAddrest = shippingAddrest;
    this.shippingDate = shippingDate;
    this.shippingCompany = shippingCompany;
    this.trackingNumber = trackingNumber;
    this.shippingStatus = shippingStatus;
    this.deliveryDate = deliveryDate;
    this.shippingCost = shippingCost;
    this.shippingNotes = shippingNotes;
  }

  public Long getShippingId() {
    return shippingId;
  }

  public void setShippingId(Long shippingId) {
    this.shippingId = shippingId;
  }

  public Long getShippingTransactionId() {
    return shippingTransactionId;
  }

  public void setShippingTransactionId(Long shippingTransactionId) {
    this.shippingTransactionId = shippingTransactionId;
  }

  public Long getShippingCustomerId() {
    return shippingCustomerId;
  }

  public void setShippingCustomerId(Long shippingCustomerId) {
    this.shippingCustomerId = shippingCustomerId;
  }

  public String getShippingAddrest() {
    return shippingAddrest;
  }

  public void setShippingAddrest(String shippingAddrest) {
    this.shippingAddrest = shippingAddrest;
  }

  public LocalDateTime getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(LocalDateTime shippingDate) {
    this.shippingDate = shippingDate;
  }

  public String getShippingCompany() {
    return shippingCompany;
  }

  public void setShippingCompany(String shippingCompany) {
    this.shippingCompany = shippingCompany;
  }

  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Integer getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(Integer shippingStatus) {
    this.shippingStatus = shippingStatus;
  }

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Double getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
  }

  public String getShippingNotes() {
    return shippingNotes;
  }

  public void setShippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
  }

  @Override
  public String toString() {
    return "Shipping [shippingId=" + shippingId + ", shippingTransactionId=" + shippingTransactionId
        + ", shippingCustomerId=" + shippingCustomerId + ", shippingAddrest=" + shippingAddrest
        + ", shippingDate=" + shippingDate + ", shippingCompany=" + shippingCompany
        + ", trackingNumber=" + trackingNumber + ", shippingStatus=" + shippingStatus
        + ", deliveryDate=" + deliveryDate + ", shippingCost=" + shippingCost + ", shippingNotes="
        + shippingNotes + "]";
  }



}


