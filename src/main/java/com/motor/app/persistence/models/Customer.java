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
@Table(name = "customer")
public class Customer {

  @Id
  @Column(name = "mtr_id_customer")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCustomer;

  @Column(name = "mtr_name_customer")
  private String nameCustomer;

  @Column(name = "mtr_lastname_customer")
  private String lastnameCustomer;

  @Column(name = "mtr_age_customer")
  private String ageCustomer;

  @Column(name = "mtr_password_customer")
  private String passwordCustomer;

  @Column(name = "mtr_email_customer")
  private String emailCustomer;

  @Column(name = "mtr_phone_number_customer")
  private String phoneCustomer;

  @Column(name = "mtr_address_customer")
  private String addressCustomer;

  @Column(name = "mtr_city_customer")
  private String cityCustomer;

  @Column(name = "mtr_image_customer")
  private String imageCustomer;

  public Long getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Long idCustomer) {
    this.idCustomer = idCustomer;
  }

  public String getNameCustomer() {
    return nameCustomer;
  }

  public void setNameCustomer(String nameCustomer) {
    this.nameCustomer = nameCustomer;
  }

  public String getLastnameCustomer() {
    return lastnameCustomer;
  }

  public void setLastnameCustomer(String lastnameCustomer) {
    this.lastnameCustomer = lastnameCustomer;
  }

  public String getAgeCustomer() {
    return ageCustomer;
  }

  public void setAgeCustomer(String ageCustomer) {
    this.ageCustomer = ageCustomer;
  }

  public String getPasswordCustomer() {
    return passwordCustomer;
  }

  public void setPasswordCustomer(String passwordCustomer) {
    this.passwordCustomer = passwordCustomer;
  }

  public String getEmailCustomer() {
    return emailCustomer;
  }

  public void setEmailCustomer(String emailCustomer) {
    this.emailCustomer = emailCustomer;
  }

  public String getPhoneCustomer() {
    return phoneCustomer;
  }

  public void setPhoneCustomer(String phoneCustomer) {
    this.phoneCustomer = phoneCustomer;
  }

  public String getAddressCustomer() {
    return addressCustomer;
  }

  public void setAddressCustomer(String addressCustomer) {
    this.addressCustomer = addressCustomer;
  }

  public String getCityCustomer() {
    return cityCustomer;
  }

  public void setCityCustomer(String cityCustomer) {
    this.cityCustomer = cityCustomer;
  }

  public String getImageCustomer() {
    return imageCustomer;
  }

  public void setImageCustomer(String imageCustomer) {
    this.imageCustomer = imageCustomer;
  }

  @Override
  public String toString() {
    return "Customer [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer
        + ", lastnameCustomer=" + lastnameCustomer + ", ageCustomer=" + ageCustomer
        + ", passwordCustomer=" + passwordCustomer + ", emailCustomer=" + emailCustomer
        + ", phoneCustomer=" + phoneCustomer + ", addressCustomer=" + addressCustomer
        + ", cityCustomer=" + cityCustomer + ", imageCustomer=" + imageCustomer + "]";
  }
}
