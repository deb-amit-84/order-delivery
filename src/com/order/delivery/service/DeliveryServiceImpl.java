package com.order.delivery.service;

import com.order.delivery.fulfillment.IFulfillmentService;
import com.order.delivery.fulfillment.OrderFulfillmentStrategyContext;
import com.order.delivery.model.Shipment;

public class DeliveryServiceImpl implements IDeliveryService{

	public void deliverShipment(Shipment shipment) {
		
		OrderFulfillmentStrategyContext context = new OrderFulfillmentStrategyContext();
		IFulfillmentService iFulfillmentService = context.getFulfillmentServiceStrategy(shipment);
	    context.deliverOrder(iFulfillmentService, shipment);
		
	}

}
