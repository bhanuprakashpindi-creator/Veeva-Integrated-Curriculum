package Service;

import java.util.Scanner;

public class OnlinePayment implements PaymentService{
    Scanner sc=new Scanner(System.in);
    @Override
    public boolean payment(double amount) {
        System.out.println("Pay To The UPI ID: 600023400@paytm");
        System.out.println("Amount: " + amount);
        System.out.println("Enter The Payment Transaction ID:");
        String tnx = sc.next();
        System.out.println("Payment Completed Successfully!");
        return true;
    }
}
