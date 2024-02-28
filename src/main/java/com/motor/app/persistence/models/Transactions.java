package com.motor.app.persistence.models;

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
@Table(name = "transactions")
public class Transactions {

  @Id
  @Column(name = "mtr_transaction_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idTransaction;

  @Column(name = "mtr_product_id")
  private Long idProduct;

  @Column(name = "mtr_customer_id")
  private Long idCustomer;

  @Column(name = "mtr_date_and_time_transaction")
  private LocalDateTime dateTransaction;

  @Column(name = "mtr_tansaction_amount")
  private Double transactionAmount;

  @Column(name = "mtr_description_transaction")
  private String descriptionTransaccion;

  @Column(name = "mtr_payment_method")
  private Integer methodPayment;

  @Column(name = "mtr_peceipt_number")
  private Double peceiptNumber;

  @Column(name = "mtr_transaction_seller")
  private Integer transactionSeller;

  @Column(name = "mtr_transaction_status")
  private Integer transactionStatus;

  public Long getIdTransaction() {
    return idTransaction;
  }

  public void setIdTransaction(Long idTransaction) {
    this.idTransaction = idTransaction;
  }

  public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public Long getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Long idCustomer) {
    this.idCustomer = idCustomer;
  }

  public LocalDateTime getDateTransaction() {
    return dateTransaction;
  }

  public void setDateTransaction(LocalDateTime dateTransaction) {
    this.dateTransaction = dateTransaction;
  }

  public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getDescriptionTransaccion() {
    return descriptionTransaccion;
  }

  public void setDescriptionTransaccion(String descriptionTransaccion) {
    this.descriptionTransaccion = descriptionTransaccion;
  }

  public Integer getMethodPayment() {
    return methodPayment;
  }

  public void setMethodPayment(Integer methodPayment) {
    this.methodPayment = methodPayment;
  }

  public Double getPeceiptNumber() {
    return peceiptNumber;
  }

  public void setPeceiptNumber(Double peceiptNumber) {
    this.peceiptNumber = peceiptNumber;
  }

  public Integer getTransactionSeller() {
    return transactionSeller;
  }

  public void setTransactionSeller(Integer transactionSeller) {
    this.transactionSeller = transactionSeller;
  }

  public Integer getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(Integer transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  @Override
  public String toString() {
    return "Transactions [idTransaction=" + idTransaction + ", idProduct=" + idProduct
        + ", idCustomer=" + idCustomer + ", dateTransaction=" + dateTransaction
        + ", transactionAmount=" + transactionAmount + ", descriptionTransaccion="
        + descriptionTransaccion + ", methodPayment=" + methodPayment + ", peceiptNumber="
        + peceiptNumber + ", transactionSeller=" + transactionSeller + ", transactionStatus="
        + transactionStatus + "]";
  }
}
