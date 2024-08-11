package com.tech.SpringBootCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.SpringBootCrud.model.Product;
import com.tech.SpringBootCrud.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return  productRepository.save(product);
	}
	
	public List<Product> saveProduct(List<Product> products) {
		return  productRepository.saveAll(products);
	}
	
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int id){
		return productRepository.findById(id).orElse(null);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product Removed !!" +id;
	}
	
	public Product updateProduct(int id,Product product) {
		Product existingProduct=productRepository.findById(id).orElse(null);
	   existingProduct.setName(product.getName());
	   existingProduct.setPrice(product.getPrice());
	   return productRepository.save(existingProduct);
	   
	}
	
}
