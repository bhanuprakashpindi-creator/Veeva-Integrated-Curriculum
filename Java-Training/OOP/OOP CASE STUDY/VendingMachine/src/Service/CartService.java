package Service;

import Exceptions.*;
import Model.Product;
import Repository.CartRepository;
import Repository.CashCounterRepository;
import Repository.ProductRepository;

import javax.naming.InsufficientResourcesException;
import java.util.HashMap;
import java.util.Scanner;

public class CartService {

    private CartRepository cartRepository;
    private ProductRepository productRepository;
    private CashCounterRepository cashCounterRepository;

    private Scanner sc = new Scanner(System.in);

    public CartService(
            CartRepository cartRepository,
            ProductRepository productRepository,
            CashCounterRepository cashCounterRepository) {

        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
        this.cashCounterRepository = cashCounterRepository;
    }

    public void addItem(String code, long quantity) {

        if (!productRepository.contains(code)) {
           throw new InvalidProductCodeException("Product Code Not Existed in The Vending Machine");
        }

        if (!productRepository.isquanityAvailable(code, quantity)) {
            throw new InsufficientProductQuantityException("Insufficient Product Quantity");
        }
        cartRepository.addItem(code, quantity);
        System.out.println("Item Added To Cart Successfully");
    }

    public void display() {
        HashMap<String, Long> cartItems =
                cartRepository.getCartItems();
        if (cartItems.isEmpty()) {
            System.out.println("Cart Is Empty");
            return;
        }

        for (String code : cartItems.keySet()) {

            Product product = productRepository.getProduct(code);

            System.out.println(
                    "Product Name: " + product.getProductName() +
                            "\nProduct Price: " + product.getPrice() +
                            "\nQuantity: " + cartItems.get(code)
            );
        }
    }

    public void checkout() {

        HashMap<String, Long> cartItems =
                cartRepository.getCartItems();

        if (cartItems.isEmpty()) {
            System.out.println("Cart Is Empty");
            return;
        }
        // Revalidate stock before checkout
        for (String code : cartItems.keySet()) {

            long quantity = cartItems.get(code);

            if (!productRepository.isquanityAvailable(code, quantity)) {
                throw new SoldOutException("Insufficient Stock For Product: " + code);
            }
        }

        double total = 0;

        display();

        for (String code : cartItems.keySet()) {

            Product product = productRepository.getProduct(code);

            total += product.getPrice() * cartItems.get(code);
        }

        System.out.println("\nTotal Bill Amount: " + total);

        System.out.println(
                "\n1. Cash Payment" +
                        "\n2. Online UPI Payment" +
                        "\n3. Cancle Payment"
        );

        System.out.print("Select Payment Option: ");
        int choice = sc.nextInt();
        PaymentService paymentService;
        switch (choice) {
            case 1:
                cashCounterRepository.display();
                paymentService =
                        new CashPayment(cashCounterRepository);
                break;
            case 2:
                paymentService = new OnlinePayment();
                break;
            case 3:
                System.out.println("Payment Cancled!!");
                return;
            default:
                throw new InvalidPaymentOptionException("Invalid Payment Option!!");
        }
        boolean paymentStatus = paymentService.payment(total);

        if (!paymentStatus) {
            throw new TransactionFailedException("Transaction Failed : Payment Not Completed Successfully!");
        }
        // Dispensing products
        System.out.println("\n========== DISPENSING PRODUCTS ==========");
        for (String code : cartItems.keySet()) {
            long quantity = cartItems.get(code);
            boolean updated = productRepository.reduceQuantity(code, quantity);
            if (updated) {
                Product product = productRepository.getProduct(code);
                System.out.println(
                        product.getProductName() +
                                " x " + quantity +
                                " - Dispensed Successfully!"
                );
            }
        }
        // Clear cart after successful dispensing
        cartRepository.clearCart();
        System.out.println("\nCart Cleared Successfully!");
        System.out.println("Thank You For Using Our Vending Machine!");
    }
}