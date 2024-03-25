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
@Table(name = "transaction_status")
public class TransactionStatus {

  @Id
  @Column(name = "mtr_id_transaction_status")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idTransactionStatus;

  @Column(name = "mtr_name_transaction_status")
  private String nameTransactionStatus;

  public Long getIdTransactionStatus() {
    return idTransactionStatus;
  }

  public void setIdTransactionStatus(Long idTransactionStatus) {
    this.idTransactionStatus = idTransactionStatus;
  }

  public String getNameTransactionStatus() {
    return nameTransactionStatus;
  }

  public void setNameTransactionStatus(String nameTransactionStatus) {
    this.nameTransactionStatus = nameTransactionStatus;
  }

  @Override
  public String toString() {
    return "TransactionStatus [idTransactionStatus=" + idTransactionStatus
        + ", nameTransactionStatus=" + nameTransactionStatus + "]";
  }
}
