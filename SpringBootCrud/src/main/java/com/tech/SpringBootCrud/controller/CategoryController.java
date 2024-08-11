package com.tech.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.SpringBootCrud.model.Category;
import com.tech.SpringBootCrud.service.CategoryService;
import com.tech.SpringBootCrud.model.Product;
import com.tech.SpringBootCrud.service.CategoryService;
import com.tech.SpringBootCrud.service.ProductService;
@RestController
@RequestMapping("/api/categories")

public class CategoryController {

	   @Autowired
	    private CategoryService categoryService;

		
		@PostMapping
		public Category addCategory(@RequestBody Category category) {
			return categoryService.saveCategory(category);
		}
		
		@GetMapping
		public List<Category> findAllProduct(){
		 return	categoryService.getCategory();
		}
		
		@GetMapping("/{id}")
		public Category findCategoryById(@PathVariable int id) {
			return categoryService.getCategoryById(id);
		}
		
		@PutMapping("/{id}")
		public Category updateCategory(@PathVariable int id ,@RequestBody Category category) {
			return categoryService.updateCategory(id,category);
		}
		
		@DeleteMapping("/{id}")
		public String deleteCategory(@PathVariable int id) {
			return categoryService.deleteCategory(id);
		}
		
	    
}
