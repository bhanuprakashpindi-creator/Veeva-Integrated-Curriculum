package OrdersCaseStudy;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRepository {
    List<Order> orderList=new ArrayList<>();
    public OrderRepository()
    {
        addMockData();
    }

    public void addOrder(Order order)
    {
        orderList.add(order);
    }

    //1. To find out orders with amount less than or equal to zero.

    // 2. Return top 3 highest spending customer IDs.
    public List<Integer> TopThreeHighestSpending()
    {
        Map<Integer,Double> customersList = orderList.stream().collect(Collectors.groupingBy(Order::getCustomerId,Collectors.summingDouble(Order::getAmountSpent)));
        customersList.entrySet().stream().sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()).limit(3).map(entry-> entry.getKey()).toList();
        return null;
    }
    public  void addMockData() {
        orderList.add(new Order(101, 1001, "Electronics", 25000));
        orderList.add(new Order(102, 1002, "Clothing", 3500));
        orderList.add(new Order(103, 1001, "Grocery", 1500));
        orderList.add(new Order(104, 1003, "Electronics", 45000));
        orderList.add(new Order(105, 1004, "Furniture", 18000));
        orderList.add(new Order(106, 1002, "Clothing", 7500));
        orderList.add(new Order(107, 1005, "Grocery", 2200));
        orderList.add(new Order(108, 1003, "Electronics", 12000));
        orderList.add(new Order(109, 1004, "Furniture", 32000));
        orderList.add(new Order(110, 1005, "Clothing", 5000));
        orderList.add(new Order(111, 1001, "Electronics", 65000));
        orderList.add(new Order(112, 1006, "Grocery", 3000));
        orderList.add(new Order(113, 1006, "Furniture", 27000));
        orderList.add(new Order(114, 1002, "Electronics", 18000));
        orderList.add(new Order(115, 1005, "Clothing", 9500));
    }


}
