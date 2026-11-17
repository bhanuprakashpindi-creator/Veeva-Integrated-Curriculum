package service;

import model.Product;
import repository.UserTransactionsRepository;

import java.util.HashMap;

public class UserTransactionService {
    private UserTransactionsRepository userTransactionsRepository;

    public UserTransactionService(UserTransactionsRepository userTransactionsRepository) {
        this.userTransactionsRepository = userTransactionsRepository;
    }

    public void addTransaction(HashMap<Product, Long> cartItems) {
        userTransactionsRepository.addTransaction(cartItems);
    }

    public void display() {
        HashMap<Integer, HashMap<Product, Long>> trxs = userTransactionsRepository.dispaly();
        System.out.println("All Users Transactions :");
        for (Integer integer : trxs.keySet()) {
            HashMap<Product, Long> cartItem = trxs.get(integer);
            System.out.println("Transaction ID: " + integer);
            for (Product product : cartItem.keySet()) {
                System.out.println("Product Details");
                System.out.println("Product Name: " + product.getProductName() + "\nUnit Price: " + product.getUnitPrice()
                        + "\nCategory: " + product.getCategory() + "Total Quantity: " + cartItem.get(product));
            }
        }
    }
}
