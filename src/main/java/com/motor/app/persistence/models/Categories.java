package com.motor.app.persistence.models;

import java.util.Arrays;
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

  @Column(name = "category_image")
  private byte[] categoryImage;

  public Categories(String categoryName, String categoryDescription, byte[] categoryImage) {
    super();
    this.categoryName = categoryName;
    this.categoryDescription = categoryDescription;
    this.categoryImage = categoryImage;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  public byte[] getCategoryImage() {
    return categoryImage;
  }

  public void setCategoryImage(byte[] categoryImage) {
    this.categoryImage = categoryImage;
  }

  @Override
  public String toString() {
    return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName
        + ", categoryDescription=" + categoryDescription + ", categoryImage="
        + Arrays.toString(categoryImage) + "]";
  }



}
