package com.devsuperior.desafio1.service;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double taxship ;
        if (order.getBasic() < 100.0) {
            taxship = 20.00;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            taxship = 12.00;
        } else {
            taxship = 0.0;
        }

       return taxship;
    }


}


