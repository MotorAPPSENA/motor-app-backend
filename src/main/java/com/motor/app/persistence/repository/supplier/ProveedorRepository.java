package com.motor.app.persistence.repository.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motor.app.persistence.models.Proveedor;

/*
 *Esta interfaz esta preparada para poder realizar las consultasa la base de datos de en este caso "Suppliers" 
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

  Proveedor findByIdentifier(String identifier);

}
