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
@Table(name = "roles")
public class Rol {

  @Id
  @Column(name = "mtr_id_role")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idRol;

  @Column(name = "mtr_name_role")
  private String nameRol;

  public Long getIdRol() {
    return idRol;
  }

  public void setIdRol(Long idRol) {
    this.idRol = idRol;
  }

  public String getNameRol() {
    return nameRol;
  }

  public void setNameRol(String nameRol) {
    this.nameRol = nameRol;
  }

  @Override
  public String toString() {
    return "Rol [idRol=" + idRol + ", nameRol=" + nameRol + "]";
  }
}
