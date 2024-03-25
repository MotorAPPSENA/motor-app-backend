package com.motor.app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.motor.app.persistence.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

  @Query(value = "select mtr_id_user from users where mtr_username= :username", nativeQuery = true)
  Long buscarUsuario(@Param("username") String username);
  
  @Query(value = "select * from users where mtr_username= :username LIMIT 1", nativeQuery = true)
  Users buscarUsuarioPorUserName(@Param("username") String username);
}
