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

  public Brands(Long brandId, String brandName, String countryOriginBrand, String foundingYearBrand,
      String webSiteBrand, String descriptionBrand, String logouUrl) {
    super();
    this.brandId = brandId;
    this.brandName = brandName;
    this.countryOriginBrand = countryOriginBrand;
    this.foundingYearBrand = foundingYearBrand;
    this.webSiteBrand = webSiteBrand;
    this.descriptionBrand = descriptionBrand;
    this.logouUrl = logouUrl;
  }

  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getCountryOriginBrand() {
    return countryOriginBrand;
  }

  public void setCountryOriginBrand(String countryOriginBrand) {
    this.countryOriginBrand = countryOriginBrand;
  }

  public String getFoundingYearBrand() {
    return foundingYearBrand;
  }

  public void setFoundingYearBrand(String foundingYearBrand) {
    this.foundingYearBrand = foundingYearBrand;
  }

  public String getWebSiteBrand() {
    return webSiteBrand;
  }

  public void setWebSiteBrand(String webSiteBrand) {
    this.webSiteBrand = webSiteBrand;
  }

  public String getDescriptionBrand() {
    return descriptionBrand;
  }

  public void setDescriptionBrand(String descriptionBrand) {
    this.descriptionBrand = descriptionBrand;
  }

  public String getLogouUrl() {
    return logouUrl;
  }

  public void setLogouUrl(String logouUrl) {
    this.logouUrl = logouUrl;
  }

  @Override
  public String toString() {
    return "Brands [brandId=" + brandId + ", brandName=" + brandName + ", countryOriginBrand="
        + countryOriginBrand + ", foundingYearBrand=" + foundingYearBrand + ", webSiteBrand="
        + webSiteBrand + ", descriptionBrand=" + descriptionBrand + ", logouUrl=" + logouUrl + "]";
  }
}

