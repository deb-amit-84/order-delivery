package com.order.delivery.model;

import java.util.Date;
import java.util.List;

public class Order {

	private int orderId;
	private List<Item> orderItem;
	private Address ShippingAddress;
	private Date orderDate;
	private Customer customer;
	private double totalCost;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Item> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<Item> orderItem) {
		this.orderItem = orderItem;
	}

	public Address getShippingAddress() {
		return ShippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		ShippingAddress = shippingAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	

}
