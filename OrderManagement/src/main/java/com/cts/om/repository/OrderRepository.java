package com.cts.om.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.om.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
