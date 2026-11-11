 package com.ecommerce;
import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;

import javax.swing.*;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

public class HomeMenu {

    // One cart shared throughout this application's shopping session
    private static final Cart cart = new Cart();

    private static final DecimalFormat moneyFormat =
            new DecimalFormat("#,##0.00");

    // Main shopping menu
    public static void showMenu(String customerName) {

        while (true) {

            String[] options = {
                    "View All Products",
                    "Search Products",
                    "Add Product to Cart",
                    "View Cart",
                    "My Orders",
                    "Logout"
            };

            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Welcome, " + customerName + "!",
                    "Shopping Home",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {

                case 0:
                    viewAllProducts();
                    break;

                case 1:
                    searchProducts();
                    break;

                case 2:
                    addProductToCart();
                    break;

                case 3:
                    viewCart();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(
                            null,
                            "My Orders will be implemented later."
                    );
                    break;

                case 5:
                case -1:
                    JOptionPane.showMessageDialog(
                            null,
                            "Logged out successfully!"
                    );
                    return;
            }
        }
    }

    // Product search menu
    public static void searchProducts() {

        String[] options = {
                "Search by Product ID",
                "Search by Product Name",
                "Search by Name and Exact Price",
                "Search by Name and Price Range",
                "Search by Name and Company",
                "Search by Name, Company and Price",
                "Back"
        };

        int choice = JOptionPane.showOptionDialog(
                null,
                "Select your search method:",
                "Search Products",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (choice) {

            case 0:
                searchProductById();
                break;

            case 1:
                searchProductByName();
                break;

            case 2:
                searchByNameAndPrice();
                break;

            case 3:
                searchByNameAndPriceRange();
                break;

            case 4:
                searchByNameAndCompany();
                break;

            case 5:
                searchByNameCompanyAndPrice();
                break;

            case 6:
            case -1:
                return;
        }
    }

    // Display all products
    public static void viewAllProducts() {

        try {

            ProductDAO dao = new ProductDAO();
            List<Product> products = dao.getAllProducts();

            if (products.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "No products available."
                );
                return;
            }

            StringBuilder result = new StringBuilder();

            for (Product product : products) {

                result.append("Product ID: ")
                        .append(product.getProductId())
                        .append("\nProduct Name: ")
                        .append(product.getProductName())
                        .append("\nCompany: ")
                        .append(product.getCompany())
                        .append("\nPrice: ₹")
                        .append(moneyFormat.format(product.getPrice()))
                        .append("\nStock: ")
                        .append(product.getStockQuantity())
                        .append("\nDescription: ")
                        .append(product.getDescription())
                        .append("\n")
                        .append("--------------------------------\n");
            }

            JTextArea textArea = new JTextArea(result.toString());
            textArea.setEditable(false);
            textArea.setCaretPosition(0);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(
                    new java.awt.Dimension(500, 400)
            );

            JOptionPane.showMessageDialog(
                    null,
                    scrollPane,
                    "All Products",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Product ID
    public static void searchProductById() {

        String input = JOptionPane.showInputDialog(
                null,
                "Enter Product ID:"
        );

        if (input == null) return;

        try {

            int productId = Integer.parseInt(input.trim());

            if (productId <= 0) {
                showMessage("Product ID must be greater than zero.");
                return;
            }

            ProductDAO dao = new ProductDAO();
            Product product = dao.findByProductId(productId);

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound("Product ID: " + productId);
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid integer Product ID.");
        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Product Name
    public static void searchProductByName() {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Product Name:"
        );

        if (name == null) return;

        if (name.trim().isEmpty()) {
            showMessage("Product name cannot be empty.");
            return;
        }

        try {

            ProductDAO dao = new ProductDAO();
            Product product = dao.findByProductName(name.trim());

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound("Product Name: " + name);
            }

        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Name and Exact Price
    public static void searchByNameAndPrice() {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Product Name:"
        );

        if (name == null) return;

        if (name.trim().isEmpty()) {
            showMessage("Product name cannot be empty.");
            return;
        }

        String priceInput = JOptionPane.showInputDialog(
                null,
                "Enter Exact Price:"
        );

        if (priceInput == null) return;

        try {

            double price = Double.parseDouble(priceInput.trim());

            if (!Double.isFinite(price) || price < 0) {
                showMessage("Enter a valid non-negative price.");
                return;
            }

            ProductDAO dao = new ProductDAO();
            Product product = dao.findByNameAndPrice(name.trim(), price);

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound(
                        "Name: " + name + ", Price: ₹" + price
                );
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid price.");
        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Name and Price Range
    public static void searchByNameAndPriceRange() {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Product Name:"
        );

        if (name == null) return;

        if (name.trim().isEmpty()) {
            showMessage("Product name cannot be empty.");
            return;
        }

        String minInput = JOptionPane.showInputDialog(
                null,
                "Enter Minimum Price:"
        );

        if (minInput == null) return;

        String maxInput = JOptionPane.showInputDialog(
                null,
                "Enter Maximum Price:"
        );

        if (maxInput == null) return;

        try {

            double minPrice = Double.parseDouble(minInput.trim());
            double maxPrice = Double.parseDouble(maxInput.trim());

            if (!Double.isFinite(minPrice)
                    || !Double.isFinite(maxPrice)
                    || minPrice < 0
                    || maxPrice < minPrice) {

                showMessage("Please enter a valid price range.");
                return;
            }

            ProductDAO dao = new ProductDAO();

            Product product = dao.findByNameAndPriceRange(
                    name.trim(),
                    minPrice,
                    maxPrice
            );

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound(
                        "Name: " + name
                                + ", Price Range: ₹" + minPrice
                                + " - ₹" + maxPrice
                );
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter valid numeric prices.");
        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Name and Company
    public static void searchByNameAndCompany() {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Product Name:"
        );

        if (name == null) return;

        if (name.trim().isEmpty()) {
            showMessage("Product name cannot be empty.");
            return;
        }

        String company = JOptionPane.showInputDialog(
                null,
                "Enter Company Name:"
        );

        if (company == null) return;

        if (company.trim().isEmpty()) {
            showMessage("Company name cannot be empty.");
            return;
        }

        try {

            ProductDAO dao = new ProductDAO();

            Product product = dao.findByNameAndCompany(
                    name.trim(),
                    company.trim()
            );

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound(
                        "Name: " + name + ", Company: " + company
                );
            }

        } catch (SQLException e) {
            showError(e);
        }
    }

    // Search by Name, Company and Exact Price
    public static void searchByNameCompanyAndPrice() {

        String name = JOptionPane.showInputDialog(
                null,
                "Enter Product Name:"
        );

        if (name == null) return;

        if (name.trim().isEmpty()) {
            showMessage("Product name cannot be empty.");
            return;
        }

        String company = JOptionPane.showInputDialog(
                null,
                "Enter Company Name:"
        );

        if (company == null) return;

        if (company.trim().isEmpty()) {
            showMessage("Company name cannot be empty.");
            return;
        }

        String priceInput = JOptionPane.showInputDialog(
                null,
                "Enter Exact Price:"
        );

        if (priceInput == null) return;

        try {

            double price = Double.parseDouble(priceInput.trim());

            if (!Double.isFinite(price) || price < 0) {
                showMessage("Enter a valid non-negative price.");
                return;
            }

            ProductDAO dao = new ProductDAO();

            Product product = dao.findByNameCompanyAndPrice(
                    name.trim(),
                    company.trim(),
                    price
            );

            if (product != null) {
                displayProduct(product);
            } else {
                showProductNotFound(
                        "Name: " + name
                                + ", Company: " + company
                                + ", Price: ₹" + price
                );
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid price.");
        } catch (SQLException e) {
            showError(e);
        }
    }

    // Add product to cart
    public static void addProductToCart() {

        String idInput = JOptionPane.showInputDialog(
                null,
                "Enter Product ID to add to cart:"
        );

        if (idInput == null) return;

        int productId;

        try {
            productId = Integer.parseInt(idInput.trim());

            if (productId <= 0) {
                showMessage("Product ID must be greater than zero.");
                return;
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid Product ID.");
            return;
        }

        try {

            ProductDAO dao = new ProductDAO();
            Product product = dao.findByProductId(productId);

            if (product == null) {
                showProductNotFound("Product ID: " + productId);
                return;
            }

            if (product.getStockQuantity() <= 0) {
                showMessage("This product is currently out of stock.");
                return;
            }

            String quantityInput = JOptionPane.showInputDialog(
                    null,
                    "Product: " + product.getProductName()
                            + "\nPrice: ₹" + moneyFormat.format(product.getPrice())
                            + "\nAvailable stock: " + product.getStockQuantity()
                            + "\nEnter quantity:"
            );

            if (quantityInput == null) return;

            int quantity;

            try {
                quantity = Integer.parseInt(quantityInput.trim());
            } catch (NumberFormatException e) {
                showMessage("Please enter a valid quantity.");
                return;
            }

            if (quantity <= 0) {
                showMessage("Quantity must be greater than zero.");
                return;
            }

            if (quantity > product.getStockQuantity()) {
                showMessage(
                        "Insufficient stock. Available quantity: "
                                + product.getStockQuantity()
                );
                return;
            }

            boolean added = cart.addProduct(product, quantity);

            if (added) {

                JOptionPane.showMessageDialog(
                        null,
                        product.getProductName()
                                + " added to cart successfully!"
                                + "\nQuantity: " + quantity
                                + "\nItem total: ₹"
                                + moneyFormat.format(product.getPrice() * quantity),
                        "Added to Cart",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                showMessage(
                        "Unable to add the requested quantity. "
                                + "Please check the available stock."
                );
            }

        } catch (SQLException e) {
            showError(e);
        }
    }

    // View cart and show cart actions
    public static void viewCart() {

        while (true) {

            if (cart.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Your shopping cart is empty.",
                        "Shopping Cart",
                        JOptionPane.INFORMATION_MESSAGE
                );

                return;
            }

            StringBuilder result = new StringBuilder();

            List<CartItem> items = cart.getItems();

            for (CartItem item : items) {

                Product product = item.getProduct();

                result.append("Product ID: ")
                        .append(product.getProductId())
                        .append("\nProduct: ")
                        .append(product.getProductName())
                        .append("\nCompany: ")
                        .append(product.getCompany())
                        .append("\nPrice: ₹")
                        .append(moneyFormat.format(product.getPrice()))
                        .append("\nQuantity: ")
                        .append(item.getQuantity())
                        .append("\nItem Total: ₹")
                        .append(moneyFormat.format(item.getTotalPrice()))
                        .append("\n")
                        .append("--------------------------------\n");
            }

            result.append("\nCART SUBTOTAL: ₹")
                    .append(moneyFormat.format(cart.getSubTotal()));

            String[] options = {
                    "Add Product",
                    "Update Quantity",
                    "Remove Product",
                    "Clear Cart",
                    "Back"
            };

            int choice = JOptionPane.showOptionDialog(
                    null,
                    new JScrollPane(new JTextArea(result.toString(), 15, 35)),
                    "Shopping Cart",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {

                case 0:
                    addProductToCart();
                    break;

                case 1:
                    updateCartQuantity();
                    break;

                case 2:
                    removeProductFromCart();
                    break;

                case 3:

                    int confirm = JOptionPane.showConfirmDialog(
                            null,
                            "Are you sure you want to clear your cart?",
                            "Confirm Clear Cart",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (confirm == JOptionPane.YES_OPTION) {
                        cart.clearCart();
                        showMessage("Your cart has been cleared.");
                        return;
                    }

                    break;

                case 4:
                case -1:
                    return;
            }
        }
    }

    // Update cart item quantity
    public static void updateCartQuantity() {

        String idInput = JOptionPane.showInputDialog(
                null,
                "Enter Product ID to update:"
        );

        if (idInput == null) return;

        try {

            int productId = Integer.parseInt(idInput.trim());

            if (productId <= 0) {
                showMessage("Product ID must be greater than zero.");
                return;
            }

            String quantityInput = JOptionPane.showInputDialog(
                    null,
                    "Enter new quantity:"
            );

            if (quantityInput == null) return;

            int quantity = Integer.parseInt(quantityInput.trim());

            if (quantity <= 0) {
                showMessage("Quantity must be greater than zero.");
                return;
            }

            boolean updated = cart.updateQuantity(productId, quantity);

            if (updated) {
                showMessage("Cart quantity updated successfully.");
            } else {
                showMessage(
                        "Unable to update quantity. Check the Product ID "
                                + "and available stock."
                );
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter valid numeric values.");
        }
    }

    // Remove product from cart
    public static void removeProductFromCart() {

        String idInput = JOptionPane.showInputDialog(
                null,
                "Enter Product ID to remove:"
        );

        if (idInput == null) return;

        try {

            int productId = Integer.parseInt(idInput.trim());

            if (productId <= 0) {
                showMessage("Product ID must be greater than zero.");
                return;
            }

            boolean removed = cart.removeProduct(productId);

            if (removed) {
                showMessage("Product removed from cart.");
            } else {
                showMessage("Product ID was not found in your cart.");
            }

        } catch (NumberFormatException e) {
            showMessage("Please enter a valid Product ID.");
        }
    }

    // Display product details
    public static void displayProduct(Product product) {

        String details =
                "Product ID: " + product.getProductId()
                        + "\nProduct Name: " + product.getProductName()
                        + "\nCompany: " + product.getCompany()
                        + "\nPrice: ₹" + moneyFormat.format(product.getPrice())
                        + "\nAvailable Stock: " + product.getStockQuantity()
                        + "\nDescription: " + product.getDescription();

        JOptionPane.showMessageDialog(
                null,
                details,
                "Product Details",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Product not found
    private static void showProductNotFound(String searchDetails) {

        JOptionPane.showMessageDialog(
                null,
                "No matching product found.\n" + searchDetails,
                "Product Not Found",
                JOptionPane.WARNING_MESSAGE
        );
    }

    // General message
    private static void showMessage(String message) {

        JOptionPane.showMessageDialog(
                null,
                message,
                "Shopping Application",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Display errors
    private static void showError(Exception e) {

        JOptionPane.showMessageDialog(
                null,
                "An error occurred:\n" + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
        );

        e.printStackTrace();
    }
}

