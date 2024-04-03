package com.motor.app.persistence.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motor.app.persistence.models.Products;

/*
 * 
 */
public interface ProductRepository extends JpaRepository<Products, Long> {

}
