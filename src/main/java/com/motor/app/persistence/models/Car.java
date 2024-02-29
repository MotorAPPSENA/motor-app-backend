package com.motor.app.persistence.models;

import java.time.LocalDateTime;
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
@Table(name = "car")
public class Car {

  @Id
  @Column(name = "mtr_car_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long carId;

  @Column(name = "mtr_customer_id_fk")
  private Long customerId;

  @Column(name = "mtr_creation_date_car")
  private LocalDateTime creationDateCar;

  public Car(LocalDateTime creationDateCar) {
    super();
    this.creationDateCar = creationDateCar;
  }

  public Long getCarId() {
    return carId;
  }

  public void setCarId(Long carId) {
    this.carId = carId;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public LocalDateTime getCreationDateCar() {
    return creationDateCar;
  }

  public void setCreationDateCar(LocalDateTime creationDateCar) {
    this.creationDateCar = creationDateCar;
  }

  @Override
  public String toString() {
    return "Car [carId=" + carId + ", customerId=" + customerId + ", creationDateCar="
        + creationDateCar + "]";
  }
}
