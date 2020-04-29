package com.cts.om.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.om.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
