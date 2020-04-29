package com.cts.om.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.om.entities.OrderItem;
import com.cts.om.service.OrderItemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/item")
@Api(value = "The Orderitem Controller", description = "Rest controller for orderitem")
public class OrderItemController {
	@Autowired
	 private OrderItemService service;
	@ApiOperation(value = "Get all orderitems",
			produces = "A list of orderitem",
			notes = "Hit this URL to get all orderitems details"
			)
	@RequestMapping("/all")
	List<OrderItem> getOrderItems() {
	 return	service.getOrderItem();
	}
	
	@ApiOperation(value = "Add a orderitem",
			consumes = "A new orderitem is JSON",
			notes = "Hit this URL to insert a new orderitem details"
			)
	@RequestMapping(method= RequestMethod.POST ,value="/add")
	void addOrderItem(@RequestBody OrderItem orderitem) {
		service.addOrderItem(orderitem);
	}
	
	@ApiOperation(value = "Update a orderitem details",
			consumes = "An existing orderitem in JSON",
			notes = "Hit this URL to update a orderitem details"
			)
	@RequestMapping(method = RequestMethod.PUT)
	void updateOrderItem(@RequestBody OrderItem orderitem) {
		service.updateOrderItem(orderitem);
	}
	
	@ApiOperation(value = "Delete a orderitem",
			consumes = "An existing orderitem id",
			notes = "Hit this URL to delete a orderitem details"
			)
	@RequestMapping(method = RequestMethod.DELETE, value="/deleteId")
	void deleteOrderItem(@PathVariable Long orderItemId) {
		service.deleteOrderItem(orderItemId);
	}
}
