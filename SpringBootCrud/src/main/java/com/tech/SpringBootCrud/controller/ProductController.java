package com.tech.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.SpringBootCrud.model.Product;
import com.tech.SpringBootCrud.service.ProductService;

@RestController

@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> findAllProduct(){
	 return	productService.getProduct();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	
	@DeleteMapping("{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}
	
	
}
