import service.*;
import repository.*;

import java.util.Scanner;

public class Home {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ================= REPOSITORY LAYER =================

        CompanyRepository companyRepository =
                new CompanyRepository();

        ProductRepository productRepository =
                new ProductRepository(companyRepository);

        UserTransactionsRepository userTransactionsRepository =
                new UserTransactionsRepository();

        AllTransactionsRepository allTransactionsRepository =
                new AllTransactionsRepository();

        CartRepository cartRepository =
                new CartRepository(
                        productRepository,
                        userTransactionsRepository
                );

        // ================= SERVICE LAYER =================

        CompanyService companyService =
                new CompanyService(companyRepository);

        ProductService productService =
                new ProductService(productRepository);

        CartService cartService =
                new CartService(cartRepository);

        UserTransactionService userTransactionService =
                new UserTransactionService(userTransactionsRepository);

        AllTransactionsService allTransactionsService =
                new AllTransactionsService(
                        allTransactionsRepository,
                        companyRepository
                );

        // ================= MOCK DATA =================

        MockData.loadData(
                companyRepository,
                productRepository
        );

        // ================= ROLE SELECTION =================

        int role;

        do {

            System.out.println("\n==================================");
            System.out.println("       E-COMMERCE APPLICATION");
            System.out.println("==================================");

            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("0. Exit");

            System.out.print("Select Your Role: ");
            role = sc.nextInt();

            switch (role) {

                case 1:
                    adminDashboard(
                            companyService,
                            productService,
                            allTransactionsService
                    );
                    break;

                case 2:
                    userDashboard(
                            productService,
                            cartService,
                            userTransactionService
                    );
                    break;

                case 0:
                    System.out.println("Thank You For Visiting!");
                    break;

                default:
                    System.out.println("Invalid Role!");
            }

        } while (role != 0);

        sc.close();
    }


    // =====================================================
    //                    ADMIN DASHBOARD
    // =====================================================

    public static void adminDashboard(
            CompanyService companyService,
            ProductService productService,
            AllTransactionsService allTransactionsService) {

        int choice;

        do {

            System.out.println("\n========== ADMIN DASHBOARD ==========");

            System.out.println("1. Add Company");
            System.out.println("2. Update Company");
            System.out.println("3. Add Product");
            System.out.println("4. Update Product");
            System.out.println("5. Product Price Lookup");
            System.out.println("6. View All Transactions");
            System.out.println("0. Logout");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    companyService.addCompany();
                    break;

                case 2:
                    companyService.updateCompany();
                    break;

                case 3:
                    productService.addProduct();
                    break;

                case 4:
                    productService.updateProduct();
                    break;

                case 5:
                    productService.priceLookUp();
                    break;

                case 6:
                    allTransactionsService.display();
                    break;

                case 0:
                    System.out.println("Admin Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }


    // =====================================================
    //                     USER DASHBOARD
    // =====================================================

    public static void userDashboard(
            ProductService productService,
            CartService cartService,
            UserTransactionService userTransactionService) {

        int choice;

        do {

            System.out.println("\n========== USER DASHBOARD ==========");

            System.out.println("1. Search Product");
            System.out.println("2. Add Product To Cart");
            System.out.println("3. Checkout");
            System.out.println("4. View My Transactions");
            System.out.println("0. Logout");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    productService.priceLookUp();
                    break;

                case 2:
                    cartService.addProductToCart();
                    break;

                case 3:
                    cartService.checkout();
                    break;

                case 4:
                    userTransactionService.display();
                    break;

                case 0:
                    System.out.println("User Logged Out!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }
}