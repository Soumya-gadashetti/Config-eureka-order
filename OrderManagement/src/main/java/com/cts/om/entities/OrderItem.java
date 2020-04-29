package com.cts.om.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is the orderitem model")
@Entity
@Table(name="orderitem")
public class OrderItem {
	@ApiModelProperty(value = "A unique key for each orderItem")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long orderItemId;
	
	
	@ManyToOne
	private Product product;
	
	@ApiModelProperty(value = "quantity for each orderitem")
	@NotNull
	@Column(unique=true)
	private int quantity;
	
	@ApiModelProperty(value = "price for each orderitem")
	@NotNull
	@Column(unique=true)
	private double price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_order")
	private Order orders;

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return orders;
	}

	public void setOrder(Order order) {
		this.orders = order;
	}

	public OrderItem() {
		super();
	}
	
	
	

}
