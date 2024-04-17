
# Project Title

Order delivery

# Problem Statement
In ecommerce application , in order to deliver the product we need a implementation which can select the order fulfillment service provider and deliver the order to the customers based on the location/area of the customer's address. eg: rural or urban
Design an object oriented implementation with appropriate design patterns


# Solution
Please take a look at the solution starting from DeliveryServiceImpl class which will be invoked via a REST api called externally by a client by passing shipment object
I have used Strategy design pattern to solve the problem, take a look in package: com.order.delivery.fulfillment