package com.motor.app.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 */
@Data
@Entity
@NoArgsConstructor
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

  @Column(name = "mtr_identifier_suppliers", unique = true)
  private String identifier;
}


