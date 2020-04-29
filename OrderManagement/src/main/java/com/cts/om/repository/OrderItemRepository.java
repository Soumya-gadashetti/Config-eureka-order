package com.cts.om.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.om.entities.OrderItem;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

}
