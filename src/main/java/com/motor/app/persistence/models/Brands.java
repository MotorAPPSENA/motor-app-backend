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
@Table(name = "brands")
public class Brands {

  @Id
  @Column(name = "mtr_brand_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long brandId;

  @Column(name = "mtr_brand_name")
  private String brandName;

  @Column(name = "mtr_country_origin_brand")
  private String countryOriginBrand;

  @Column(name = "mtr_founding_year_brand")
  private String foundingYearBrand;

  @Column(name = "mtr_web_site_brand")
  private String webSiteBrand;

  @Column(name = "mtr_description_brand")
  private String descriptionBrand;

  @Column(name = "mtr_logo_url")
  private String logouUrl;
}

