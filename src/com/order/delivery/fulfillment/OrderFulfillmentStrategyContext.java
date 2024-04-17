package com.order.delivery.fulfillment;

import java.util.HashMap;
import java.util.Map;

import com.order.delivery.model.Shipment;

/*
Context acts as single point of contact for the Client to get relevant Strategy
*/
public class OrderFulfillmentStrategyContext {
	
	   Map<String, IFulfillmentService> strategyContext = new HashMap<String, IFulfillmentService>();

	   public OrderFulfillmentStrategyContext() {
	        strategyContext.put("Rural", new RuralCartFulfillmentServiceProvider());
	        strategyContext.put("Urban", new UrbanCartFulfillmentServiceProvider());
	    }
	
	public IFulfillmentService getFulfillmentServiceStrategy(Shipment shipment) {
		
		String serviceArea = fetchDeliveryServiceArea(shipment.getDeliveryAddress().getAreaName(),
				shipment.getDeliveryAddress().getCityCode());
	      return strategyContext.get(serviceArea);
    }
	
	public void deliverOrder(IFulfillmentService fulfillment, Shipment shipment) {
		   
		    String serviceArea = fetchDeliveryServiceArea(shipment.getDeliveryAddress().getAreaName(),
				shipment.getDeliveryAddress().getCityCode());
		
		    String carrier = fulfillment.findClosestServiceProvider(shipment, serviceArea);
		    shipment.setDeliveryCarrier(carrier);
	        double finalPrice = shipment.getShipmentCost() - 
	        		(shipment.getShipmentCost() * fulfillment.caculateDiscountPercentage(shipment));
	        shipment.setFinalCharge(finalPrice);
	        fulfillment.dispatchShipment(shipment);
	}
	
	private String fetchDeliveryServiceArea(String area, String cityCode) {
		
		// call an external location service/rest api by passing area and cityCode to
		// fetch delivery location falls under rural/urban area
		String deliveryArea = "Urban";
		return deliveryArea;
	}
}
