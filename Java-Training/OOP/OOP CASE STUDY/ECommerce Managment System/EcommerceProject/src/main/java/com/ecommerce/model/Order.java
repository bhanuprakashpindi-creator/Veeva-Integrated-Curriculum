package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order{

    private  int orderId;
    private List<CartItem> items;
    private double totalAmount;
    private LocalDateTime orderDate;
    private  String status;

    public Order(int orderId,List<CartItem> items)
    {
            this.orderId=orderId;

            this.items=items;

            for(CartItem item:items)
            {
                this.items.add(new CartItem(item.getProduct(),item.getQuantity()));
            }

            this.totalAmount=calculateTotal();
            this.orderDate=LocalDateTime.now();
            this.status="PLACED";
    }

    public double calculateTotal()
    {

        double total=0;
        for(CartItem item:items)
        {
            total+=item.getTotalPrice();
        }
        return total;
    }
    public int getOrderId()
    {
        return orderId;
    }
    public List<CartItem> getItems()
    {
        return  new ArrayList<>(items);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

}
