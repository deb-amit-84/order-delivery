package com.order.delivery.model;

import java.util.List;

public class Customer {
	
	private String id;
	private String name;
	private Address address;
	private String email;
	private List<OrderHistory> orderhistory;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<OrderHistory> getOrderhistory() {
		return orderhistory;
	}
	public void setOrderhistory(List<OrderHistory> orderhistory) {
		this.orderhistory = orderhistory;
	}
	
	
	
}
