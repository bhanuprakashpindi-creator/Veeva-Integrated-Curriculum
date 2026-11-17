package repository;

import model.Product;

import java.util.HashMap;

public class AllTransactionsRepository {
    HashMap<Integer,HashMap<Product,Long>> allTransactions = new HashMap<>();
    static int count=101;
    public void addTransaction(HashMap<Product,Long> cartItems)
    {
        allTransactions.put(count++,cartItems);
        System.out.println("Transaction Created SuccessFully...");
    }
    public HashMap<Integer,HashMap<Product,Long>> dispaly()
    {
        return allTransactions;
    }
}
