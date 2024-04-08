package com.motor.app.persistence.repository.brands;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motor.app.persistence.models.Brands;

/*
 * 
 */

public interface BrandsRepository extends JpaRepository<Brands, Long>{
  
  Brands findByCategoryName(String name);
}
