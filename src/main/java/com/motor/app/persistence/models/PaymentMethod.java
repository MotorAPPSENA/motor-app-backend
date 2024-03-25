package com.motor.app.persistence.models;

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
@Table(name = "payment_method")
public class PaymentMethod {

  @Id
  @Column(name = "mtr_id_payment_method")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPaymentMethod;

  @Column(name = "mtr_name_payment_method")
  private String namePaymentMethod;

  public Long getIdPaymentMethod() {
    return idPaymentMethod;
  }

  public void setIdPaymentMethod(Long idPaymentMethod) {
    this.idPaymentMethod = idPaymentMethod;
  }

  public String getNamePaymentMethod() {
    return namePaymentMethod;
  }

  public void setNamePaymentMethod(String namePaymentMethod) {
    this.namePaymentMethod = namePaymentMethod;
  }

  @Override
  public String toString() {
    return "PaymentMethod [idPaymentMethod=" + idPaymentMethod + ", namePaymentMethod="
        + namePaymentMethod + "]";
  }
}
