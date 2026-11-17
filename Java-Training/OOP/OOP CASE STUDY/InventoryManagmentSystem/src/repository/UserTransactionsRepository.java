package repository;

import model.Product;

import java.util.HashMap;

public class UserTransactionsRepository {
    HashMap<Integer,HashMap<Product,Long>> userTransactions = new HashMap<>();
    static int count=101;
    public void addTransaction(HashMap<Product,Long> cartItems)
    {
        userTransactions.put(count++,cartItems);
        System.out.println("Transaction Created SuccessFully...");
    }
    public HashMap<Integer,HashMap<Product,Long>> dispaly()
    {
        return userTransactions;
    }
}
