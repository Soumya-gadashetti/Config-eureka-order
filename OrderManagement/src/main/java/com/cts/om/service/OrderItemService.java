package com.cts.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.om.entities.OrderItem;
import com.cts.om.repository.OrderItemRepository;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository repo;
	
	public List<OrderItem> getOrderItem(){
		return (List<OrderItem>) repo.findAll();
	}
	
	public void addOrderItem(OrderItem orderitem) {
		repo.save(orderitem);
	}
	
	public void deleteOrderItem(Long orderItemId) {
		repo.deleteById(orderItemId);
	}
	
	public void updateOrderItem(OrderItem orderitem) {
		repo.save(orderitem);
	}

}
