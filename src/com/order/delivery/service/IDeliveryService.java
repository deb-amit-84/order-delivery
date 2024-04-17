package com.order.delivery.service;

import com.order.delivery.model.Shipment;

// This service will be invoked from a REST api for order delivery , which will be called externally by a client by passing
// shipment object
public interface IDeliveryService {
	
	void deliverShipment(Shipment shipment);

}
