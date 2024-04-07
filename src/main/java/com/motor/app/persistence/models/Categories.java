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
@Table(name = "mtr_categories")
public class Categories {

  @Id
  @Column(name = "mtr_category_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long categoryId;

  @Column(name = "mtr_category_name")
  private String categoryName;

  @Column(name = "category_description")
  private String categoryDescription;
}
