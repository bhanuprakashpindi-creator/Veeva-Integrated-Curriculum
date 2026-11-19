package Repository;

import java.util.HashMap;

public class CartRepository {

    private HashMap<String, Long> cartItems = new HashMap<>();

    // Add item to cart
    public void addItem(String code, long quantity) {
        cartItems.put(code, quantity);
    }

    // Retrieve cart items
    public HashMap<String, Long> getCartItems() {
        return cartItems;
    }

    // Clear cart after successful checkout
    public void clearCart() {
        cartItems.clear();
    }
}