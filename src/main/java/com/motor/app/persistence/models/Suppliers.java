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
@Table(name = "suppliers")
public class Suppliers {

  @Id
  @Column(name = "mtr_supplier_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long supplierId;

  @Column(name = "mtr_supplier_name")
  private String supplierName;

  @Column(name = "mtr_supplier_addrest")
  private String supplierAddrest;

  @Column(name = "mtr_city_suppliers")
  private String citySuppliers;

  @Column(name = "mtr_country_suppliers")
  private String countrySuppliers;

  @Column(name = "mtr_phone_suppliers")
  private String phoneSuppliers;

  @Column(name = "mtr_email_suppliers")
  private String emailSuppliers;

  public Suppliers(String supplierName, String supplierAddrest, String citySuppliers,
      String countrySuppliers, String phoneSuppliers, String emailSuppliers) {
    super();
    this.supplierName = supplierName;
    this.supplierAddrest = supplierAddrest;
    this.citySuppliers = citySuppliers;
    this.countrySuppliers = countrySuppliers;
    this.phoneSuppliers = phoneSuppliers;
    this.emailSuppliers = emailSuppliers;
  }

  public Long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Long supplierId) {
    this.supplierId = supplierId;
  }

  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  public String getSupplierAddrest() {
    return supplierAddrest;
  }

  public void setSupplierAddrest(String supplierAddrest) {
    this.supplierAddrest = supplierAddrest;
  }

  public String getCitySuppliers() {
    return citySuppliers;
  }

  public void setCitySuppliers(String citySuppliers) {
    this.citySuppliers = citySuppliers;
  }

  public String getCountrySuppliers() {
    return countrySuppliers;
  }

  public void setCountrySuppliers(String countrySuppliers) {
    this.countrySuppliers = countrySuppliers;
  }

  public String getPhoneSuppliers() {
    return phoneSuppliers;
  }

  public void setPhoneSuppliers(String phoneSuppliers) {
    this.phoneSuppliers = phoneSuppliers;
  }

  public String getEmailSuppliers() {
    return emailSuppliers;
  }

  public void setEmailSuppliers(String emailSuppliers) {
    this.emailSuppliers = emailSuppliers;
  }

  @Override
  public String toString() {
    return "Suppliers [supplierId=" + supplierId + ", supplierName=" + supplierName
        + ", supplierAddrest=" + supplierAddrest + ", citySuppliers=" + citySuppliers
        + ", countrySuppliers=" + countrySuppliers + ", phoneSuppliers=" + phoneSuppliers
        + ", emailSuppliers=" + emailSuppliers + "]";
  }
}


