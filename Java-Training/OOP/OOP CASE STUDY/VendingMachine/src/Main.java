import Model.Product;
import Repository.*;
import Service.*;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ProductRepository productRepository =
            new ProductRepository();

    static Mockdata mockdata=new Mockdata(productRepository);

    static CartRepository cartRepository =
            new CartRepository();

    static CashCounterRepository cashCounterRepository =
            new CashCounterRepository();
    static  CashCounterService cashCounterService=new CashCounterService(cashCounterRepository);

    static ProductService productService =
            new ProductService(productRepository);
    static  VendingMachine vendingMachine=new VendingMachine();

    static CartService cartService =
            new CartService(
                    cartRepository,
                    productRepository,
                    cashCounterRepository
            );

    public static void main(String[] args) {


        vendingMachine.displayProducts(productRepository.getAllProducts());
        int choice;

        do {
            System.out.println("\n========== VENDING MACHINE ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Add Item To Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Add Currency into Vending Machine");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    cartService.display();
                    break;

                case 4:
                    cartService.checkout();
                    break;
                case 5:
                    cashCounterService.addCurency();
                    break;
                case 0:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Option");
            }

        } while (choice != 0);
    }

    public static void addProduct() {
        System.out.print("Enter Product Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Unit Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        long quantity = scanner.nextLong();
        scanner.nextLine();
        Product product = new Product(
                code, name, price, quantity
        );
        productService.addProduct(code, product);
    }
    public static void addItem() {
        System.out.print("Enter Product Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        long quantity = scanner.nextLong();
        scanner.nextLine();
        cartService.addItem(code, quantity);
    }
}