package com.tech.SpringBootCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.SpringBootCrud.model.Category;
import com.tech.SpringBootCrud.model.Product;
import com.tech.SpringBootCrud.repository.CategoryRepository;
import com.tech.SpringBootCrud.repository.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category saveCategory(Category category) {
		return  categoryRepository.save(category);
	}
	
	public List<Category> saveCategory(List<Category> categorys) {
		return  categoryRepository.saveAll(categorys);
	}
	
	public List<Category> getCategory(){
		return categoryRepository.findAll();
	}
	
	public Category getCategoryById(int id){
		return categoryRepository.findById(id).orElse(null);
	}
	
	public String deleteCategory(int id) {
		categoryRepository.deleteById(id);
		return "Category Removed !! " +id;
	}
	
	public Category updateCategory(int id,Category category) {
		Category existingCategory=categoryRepository.findById(id).orElse(null);
	   existingCategory.setName(category.getName());
	   return categoryRepository.save(existingCategory);
	   
	}
	
}
