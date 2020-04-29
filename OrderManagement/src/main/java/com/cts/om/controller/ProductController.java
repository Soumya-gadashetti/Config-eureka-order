package com.cts.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.om.entities.Product;
import com.cts.om.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping("/all")
	List<Product> getProduct(){
		return service.getproducts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/add")
	void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteId")
	void deleteProduct(@PathVariable Long productId) {
		service.deleteProduct(productId);
	}
}
