package com.devsuperior.desafio1.service;

import com.devsuperior.desafio1.entities.Order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private ShippingService shippingService;

    public OrderService( ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public  Double total (Order order) {
        double discount = order.getBasic() - (order.getBasic() * order.getDiscount()/100);
       return discount + shippingService.shipment(order);

    }
}
