package com.cts.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.om.entities.Product;
import com.cts.om.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getproducts(){
		return (List<Product>) repo.findAll();
	}
	
	public void addProduct(Product product) {
		repo.save(product);
	}
	
	public void deleteProduct(Long productId) {
		repo.deleteById(productId);
	}
	
	public void updateProduct(Product product) {
		repo.save(product);
	}
}
