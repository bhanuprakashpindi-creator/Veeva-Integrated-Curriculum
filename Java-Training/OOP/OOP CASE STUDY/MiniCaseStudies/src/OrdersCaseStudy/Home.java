package OrdersCaseStudy;

import java.util.List;
import java.util.Scanner;

public class Home {
    static  OrderRepository orderRepository=new OrderRepository();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        do
        {
            System.out.println("Enter The Option:");
            System.out.println("1.Add Order \n 3.Displays Top 3 Highest Spending Customer IDS");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    addOrder();
                    break;
                case 3:
                    TopThreeHighestSpending();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please Enter Correct Option");
                    break;
            }
        }
        while (choice!=0);
    }
    public static void addOrder()
    {
        System.out.println("Enter The Order Id:");
        int orderId = scanner.nextInt();
        if (orderId<1)
        {
            System.out.println("Please Enter Correct Order ID!");
            return;
        }
        scanner.next();
        System.out.println("Enter The Customer ID:");
        int customerId = scanner.nextInt();
        if (customerId<1)
        {
            System.out.println("Please Enter Correct Customer ID!");
            return;
        }
        scanner.next();
        System.out.println("Enter The Category Type");
        String category = scanner.next();
        if (category!=null)
        {
            System.out.println("Please Enter Correct Category Type");
            return;
        }
        System.out.println("Please Enter The Amount Spent:");
        double amountSpent=scanner.nextDouble();
        if (amountSpent<1)
        {
            System.out.println("Enter The Correct Amount");
            return;
        }
        Order order=new Order(orderId,customerId,category,amountSpent);
        orderRepository.addOrder(order);
        System.out.println("Order Added Successfully!!!");
    }

    public  static void TopThreeHighestSpending()
    {
        List<Integer> customerIds=orderRepository.TopThreeHighestSpending();
        customerIds.forEach(System.out::println);
    }

    }
