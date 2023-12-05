package com.devsuperior.exercicio1.service;

import com.devsuperior.exercicio1.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order){
        Double discountValue = order.getBasic() * (order.getDiscount()/100);
        return order.getBasic() - discountValue + this.shippingService.shipment(order);

    }




}
