package com.order.delivery.fulfillment;

import java.util.List;

import com.order.delivery.model.Shipment;

/* Concrete implementation of base Strategy */
public class RuralCartFulfillmentServiceProvider implements IFulfillmentService{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double caculateDiscountPercentage(Shipment shipment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateShipmentCharge(Shipment shipment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dispatchShipment(Shipment shipment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findClosestServiceProvider(Shipment shipment, String serviceArea) {
		// TODO Auto-generated method stub
		return null;
	}


}
