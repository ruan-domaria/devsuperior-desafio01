package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderService() {
    }

    public double total (Order order) {
        ShippingService shippingService = new ShippingService();
        return (order.getBasic() * (1-(order.getDiscount()/100)) + shippingService.Shipment(order));
    }
}