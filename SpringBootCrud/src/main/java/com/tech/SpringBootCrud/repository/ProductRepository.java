package com.tech.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.SpringBootCrud.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
