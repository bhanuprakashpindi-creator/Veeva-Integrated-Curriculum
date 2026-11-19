package Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CashCounterRepository {
    HashMap<Integer,Long> counter= new HashMap<>();
    public CashCounterRepository() {
        counter.put(500, 0L);
        counter.put(200, 0L);
        counter.put(100, 0L);
        counter.put(50, 0L);
        counter.put(20, 0L);
        counter.put(10, 0L);
        counter.put(5, 0L);
        counter.put(2, 0L);
        counter.put(1, 0L);
    }
    public void display()
    {
        System.out.println("\n========== CASH COUNTER ==========");
        System.out.println("Available Currency Notes / Coins");
        System.out.println("----------------------------------");
        System.out.println("Denomination  ->  Quantity");
        List<Integer> denominations = new ArrayList<>(counter.keySet());
        denominations.sort(Collections.reverseOrder());
        for (Integer denomination : denominations) {
            System.out.println("Rs." + denomination + "          ->  " + counter.get(denomination));
        }
        System.out.println("----------------------------------");
    }
    public void addCurrency(int denomination, long quantity) {

        if (!counter.containsKey(denomination)) {
            System.out.println("Invalid Currency Denomination!");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Quantity Must Be Greater Than Zero!");
            return;
        }

        counter.put(
                denomination,
                counter.get(denomination) + quantity
        );
        System.out.println("Currency Added Successfully!");
    }
    public HashMap<Integer,Long> getCounter()
    {
        return counter;
    }
    public void setCounter(HashMap<Integer,Long> counter1)
    {
        counter=counter1;
    }
    public long getTotalCash() {

        long total = 0;

        for (Integer denomination : counter.keySet()) {
            total += denomination * counter.get(denomination);
        }

        return total;
    }
}
