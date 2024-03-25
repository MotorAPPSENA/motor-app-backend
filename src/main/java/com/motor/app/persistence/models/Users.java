package com.motor.app.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 * 
 */
@Data
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
  
  @Column(name = "mtr_username")
  private String username;
  
  @Column(name = "mtr_password")
  private String password;

}
