package com.motor.app.persistence.repository.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motor.app.persistence.models.Suppliers;

/*
 * 
 */
public interface SuppliersRepository extends JpaRepository<Suppliers, Long> {

  Suppliers findByIdentifier(String identifier);
}
