package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository {

    private HashMap<String, Product> productList = new HashMap<>();
    public boolean isAvailable() {
        return productList.size() < 9;
    }

    // Check product stock
    public boolean isquanityAvailable(String code, long quantity) {

        return productList.containsKey(code) &&
                quantity > 0 &&
                productList.get(code).getQuanitity() >= quantity;
    }

    // Add product
    public void addProduct(String code, Product product) {
        productList.put(code, product);
    }

    // Check product existence
    public boolean contains(String code) {
        return productList.containsKey(code);
    }

    // Retrieve product
    public Product getProduct(String code) {
        return productList.get(code);
    }
    // Reduce product stock after successful purchase
    public boolean reduceQuantity(String code, long quantity) {

        if (!isquanityAvailable(code, quantity)) {
            return false;
        }

        Product product = productList.get(code);

        long availableQuantity = product.getQuanitity();

        product.setQuanitity(availableQuantity - quantity);

        return true;
    }
    public List<Product> getAllProducts()
    {
        return new ArrayList<>(productList.values());
    }
}