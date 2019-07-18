package com.ea.ecommerceaccountbackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class Order {
    private Long id;
    private Long accountId;
    private String orderNumber;
    private List<OrderLine> orderLines = new ArrayList<>();
    private Date orderDate;
    private Long paymentId;
    private Double tax;
    private Long shippingId;

    public void addOrderLine(OrderLine orderLine){
        this.orderLines.add(orderLine);
    }
}
