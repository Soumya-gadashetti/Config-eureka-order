package com.cts.om.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.om.entities.Order;
import com.cts.om.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	public List<Order> getorders(){
		return (List<Order>) repo.findAll();
	}
	
	public void addOrder(Order order) {
		repo.save(order);
	}
	
	public void deleteOrder(Long orderId) {
		repo.deleteById(orderId);
	}
	
	public void updateOrder(Order order) {
		repo.save(order);
	}

}
