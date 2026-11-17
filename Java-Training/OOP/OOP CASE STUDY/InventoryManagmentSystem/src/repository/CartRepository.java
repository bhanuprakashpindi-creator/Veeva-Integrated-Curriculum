package repository;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CartRepository {
   static HashMap<Product,Long> cartItems=new HashMap<>();
    private ProductRepository productRepository;
    private UserTransactionsRepository userTransactionsRepository;
    public CartRepository(ProductRepository productRepository,UserTransactionsRepository userTransactionsRepository)
    {
        this.productRepository=productRepository;
        this.userTransactionsRepository=userTransactionsRepository;
    }

    public void addProductToCart(String productName, long quantity) {
        if(!productRepository.productList.containsKey(productName))
        {
            System.out.println("No Product With Name "+productName+" Found !!");
            return;
        }
        Product product=productRepository.productList.get(productName);
        if (quantity > product.getQuantity())
        {
            System.out.println("Error : Insufficient Quantity ");
            System.out.println("Available Stock :"+product.getQuantity());
            return;
        }
        cartItems.put(product,quantity);
    }

    public double checkout() {

        if (cartItems.isEmpty()) {
            System.out.println("Cart Is Empty!");
            return 0;
        }

        double total = 0;

        for (Product product : cartItems.keySet()) {

            long quantity = cartItems.get(product);

            total += product.getUnitPrice() * quantity;
        }

        // Save transaction
        userTransactionsRepository.addTransaction(
                new HashMap<>(cartItems)
        );

        // Update product stock
        for (Product product : cartItems.keySet()) {

            product.setQuantity(
                    product.getQuantity() - cartItems.get(product)
            );
        }

        System.out.println("The Total Bill is: " + total);

        // Clear cart
        cartItems.clear();

        return total;
    }
}
