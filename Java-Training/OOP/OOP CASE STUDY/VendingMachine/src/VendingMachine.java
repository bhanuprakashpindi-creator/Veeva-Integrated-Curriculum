import Model.Product;

import java.util.HashMap;
import java.util.List;

public class VendingMachine {
    public void displayProducts(List<Product> products) {

        System.out.println("\n========== VENDING MACHINE ==========");

        if (products.isEmpty()) {
            System.out.println("No Products Available!");
            return;
        }
        int columns = 3;
        int width = 20;
        for (int i = 0; i < products.size(); i += columns) {

            // Top border
            for (int j = 0; j < columns; j++) {
                System.out.print("+" + "-".repeat(width) + "+ ");
            }
            System.out.println();
            // Product details
            for (int j = 0; j < columns; j++) {
                int index = i + j;
                if (index < products.size()) {
                    Product p = products.get(index);
                    System.out.printf("| %-18s | ", p.getCode());
                } else {
                    System.out.printf("| %-18s | ", "");
                }
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {

                int index = i + j;

                if (index < products.size()) {

                    Product p = products.get(index);

                    System.out.printf("| %-18s | ", p.getProductName());
                } else {
                    System.out.printf("| %-18s | ", "");
                }
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {

                int index = i + j;

                if (index < products.size()) {

                    Product p = products.get(index);

                    System.out.printf("| Rs.%-15.2f | ", p.getPrice());
                } else {
                    System.out.printf("| %-18s | ", "");
                }
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {

                int index = i + j;

                if (index < products.size()) {

                    Product p = products.get(index);

                    System.out.printf("| Stock: %-10d | ", p.getQuanitity());
                } else {
                    System.out.printf("| %-18s | ", "");
                }
            }

            System.out.println();
            // Bottom border
            for (int j = 0; j < columns; j++) {
                System.out.print("+" + "-".repeat(width) + "+ ");
            }
            System.out.println("\n");
        }
    }
}
