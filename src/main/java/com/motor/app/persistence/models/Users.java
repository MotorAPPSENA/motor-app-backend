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
@Table(name = "users")
public class Users {

  @Id
  @Column(name = "mtr_id_user")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUSer;

  @Column(name = "mtr_name_user")
  private String nameUser;

  @Column(name = "mtr_lastname_user")
  private String lastName;

  @Column(name = "mtr_age_user")
  private String ageUser;

  @Column(name = "mtr_position_user")
  private String position;

  @Column(name = "mtr_role_user_fk")
  private Long roleId;

  public Long getIdUSer() {
    return idUSer;
  }

  public void setIdUSer(Long idUSer) {
    this.idUSer = idUSer;
  }

  public String getNameUser() {
    return nameUser;
  }

  public void setNameUser(String nameUser) {
    this.nameUser = nameUser;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAgeUser() {
    return ageUser;
  }

  public void setAgeUser(String ageUser) {
    this.ageUser = ageUser;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }
}
