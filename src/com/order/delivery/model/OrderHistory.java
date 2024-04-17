package com.order.delivery.model;

import java.util.Date;
import java.util.List;

public class OrderHistory {
	
	 private int orderId;
	 private List<Item> orderItem;
	 private Date orderCreateDate;
	 private Date orderDeliveryDate;
	 
	 
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
	public Date getOrderCreateDate() {
		return orderCreateDate;
	}
	public void setOrderCreateDate(Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}
	public Date getOrderDeliveryDate() {
		return orderDeliveryDate;
	}
	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}
	 
}
