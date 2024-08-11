package com.tech.SpringBootCrud.repository;
import org.springframework.data.jpa.repository.*;

import com.tech.SpringBootCrud.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
