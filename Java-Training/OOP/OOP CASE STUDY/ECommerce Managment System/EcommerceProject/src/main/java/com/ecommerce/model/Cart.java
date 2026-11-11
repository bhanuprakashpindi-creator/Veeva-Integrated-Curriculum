        package com.ecommerce.model;

import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<CartItem> cartItems = new ArrayList<>();

    // Add a product to the cart
    public boolean addProduct(Product product, int quantity) {

        if (product == null || quantity <= 0) {
            return false;
        }

        // Check whether the product already exists in the cart
        for (CartItem item : cartItems) {

            if (item.getProduct().getProductId()
                    == product.getProductId()) {

                int newQuantity = item.getQuantity() + quantity;

                // Check available stock
                if (newQuantity > product.getStockQuantity()) {
                    return false;
                }

                item.setQuantity(newQuantity);
                return true;
            }
        }

        // Validate stock for a new product
        if (quantity > product.getStockQuantity()) {
            return false;
        }

        cartItems.add(new CartItem(product, quantity));
        return true;
    }

    // Get cart items
    public List<CartItem> getList() {
        return new ArrayList<>(cartItems);
    }

    // Check whether the cart is empty
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    // Calculate the subtotal
    public double getSubTotal() {

        double subTotal = 0;

        for (CartItem item : cartItems) {
            subTotal += item.getTotalPrice();
        }

        return subTotal;
    }

    // Update the quantity of a product
    public boolean updateQuantity(int productId, int quantity) {

        if (quantity <= 0) {
            return false;
        }

        for (CartItem item : cartItems) {

            if (item.getProduct().getProductId()
                    == productId) {

                if (quantity > item.getProduct().getStockQuantity()) {
                    return false;
                }

                item.setQuantity(quantity);
                return true;
            }
        }

        return false;
    }

    // Remove a product from the cart
    public boolean removeProduct(int productId) {

        return cartItems.removeIf(
                item -> item.getProduct().getProductId() == productId
        );
    }

    // Clear the cart
    public void clearCart() {
        cartItems.clear();
    }

    // Return cart items
    public List<CartItem> getItems() {
        return new ArrayList<>(cartItems);
    }
}

