package com.motor.app.persistence.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;
import com.motor.app.persistence.models.Categories;

/*
 * 
 */
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

  Categories findByCategoryName(String name);
}
