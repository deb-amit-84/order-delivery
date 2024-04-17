package com.order.delivery.model;

import java.util.List;

public class Shipment {

	private String shipmentId;
	private String shipmentMethod;
	private double shipmentCost;
	private int orderId;
	private String paymentMode;
	private int quantity;
	private List<Item> items;
	private Address deliveryAddress;
	private String deliveryCarrier;
	private double finalCharge;
	
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentMethod() {
		return shipmentMethod;
	}
	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}
	public double getShipmentCost() {
		return shipmentCost;
	}
	public void setShipmentCost(double shipmentCost) {
		this.shipmentCost = shipmentCost;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryCarrier() {
		return deliveryCarrier;
	}
	public void setDeliveryCarrier(String deliveryCarrier) {
		this.deliveryCarrier = deliveryCarrier;
	}
	public double getFinalCharge() {
		return finalCharge;
	}
	public void setFinalCharge(double finalCharge) {
		this.finalCharge = finalCharge;
	}
}
