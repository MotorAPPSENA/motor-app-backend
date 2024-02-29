package com.motor.app.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/*
 * 
 */

@Entity
@Table(name = "status_shipping")
public class StatusShipping {

  @Column(name = "mtr_shipping_status_id")
  private Long shippingStatusId;

  @Column(name = "mtr_shipping_status")
  private String shippingStatus;

  public StatusShipping(Long shippingStatusId, String shippingStatus) {
    super();
    this.shippingStatusId = shippingStatusId;
    this.shippingStatus = shippingStatus;
  }

  public Long getShippingStatusId() {
    return shippingStatusId;
  }

  public void setShippingStatusId(Long shippingStatusId) {
    this.shippingStatusId = shippingStatusId;
  }

  public String getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(String shippingStatus) {
    this.shippingStatus = shippingStatus;
  }

  @Override
  public String toString() {
    return "StatusShipping [shippingStatusId=" + shippingStatusId + ", shippingStatus="
        + shippingStatus + "]";
  }

}
