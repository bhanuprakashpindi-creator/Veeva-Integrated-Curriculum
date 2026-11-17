package service;

import repository.CartRepository;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class CartService {
    Scanner scanner = new Scanner(System.in);
    private CartRepository cartRepository;
   public CartService(CartRepository cartRepository)
    {
        this.cartRepository=cartRepository;
    }
    public void addProductToCart()
    {
        System.out.println("Enter The Product Name :");
        String productName= scanner.nextLine();
        System.out.println("Enter The Quantity :");
        long quantity=scanner.nextLong();
        scanner.nextLine();
        cartRepository.addProductToCart(productName, quantity);
    }
    public void checkout()
    {
        double total= cartRepository.checkout();
        System.out.println("The Total Bills is :"+total);
    }
}
