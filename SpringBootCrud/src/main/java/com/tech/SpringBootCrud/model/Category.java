package com.tech.SpringBootCrud.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	 @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	 @JsonManagedReference
	private List<Product> products;
	
	
	
}
