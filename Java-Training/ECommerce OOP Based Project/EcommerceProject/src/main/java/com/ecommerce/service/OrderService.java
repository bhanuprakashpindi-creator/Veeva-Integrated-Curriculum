package com.ecommerce.service;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderService {

    private final List<Order> orders=new ArrayList<>();

    private int nextOderId=1;

    //checkout cart

    public Order checkOut(Cart cart)
    {
        if(cart==null || cart.isEmpty())
            return null;

        Order order=new Order(nextOderId ,cart.getItems());

        orders.add(order);
        nextOderId++;
        cart.clearCart();
        return order;
    }
    public List<Order> getAllOrders()
    {
        return Collections.unmodifiableList(orders);
    }
    // Find an order by its ID
    public Order getOrderById(int orderId)
    {
        for (Order order : orders)
        {
            if (order.getOrderId() == orderId)
            { return order; }
        }
        return null; }
    // Check whether any orders exist
    public boolean hasOrders() {
        return !orders.isEmpty();
    }

}
