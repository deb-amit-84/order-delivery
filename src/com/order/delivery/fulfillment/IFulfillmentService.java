package com.order.delivery.fulfillment;

import com.order.delivery.model.Shipment;

/* Interface for Strategy Design pattern*/
public interface IFulfillmentService {
	  String getName();
	  double caculateDiscountPercentage(Shipment shipment);
	  double calculateShipmentCharge(Shipment shipment);
	  void dispatchShipment(Shipment shipment);
	  String findClosestServiceProvider(Shipment shipment, String serviceArea);

}
