import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {
    List<Product> products=new ArrayList<>();
    public void fetchMock() {
        products.add(new Product("Laptop", 65000, 10, "Dell"));
        products.add(new Product("Smartphone", 25000, 25, "Samsung"));
        products.add(new Product("Headphones", 2500, 50, "Sony"));
        products.add(new Product("Keyboard", 1200, 30, "Logitech"));
        products.add(new Product("Mouse", 800, 40, "HP"));
        products.add(new Product("Monitor", 15000, 15, "LG"));
        products.add(new Product("Smart Watch", 4500, 20, "Boat"));
        products.add(new Product("Tablet", 18000, 12, "Lenovo"));
        products.add(new Product("Power Bank", 1500, 35, "Anker"));
        products.add(new Product("Bluetooth Speaker", 3000, 18, "JBL"));
        products.add(new Product("Refrigerator", 32000, 8, "Whirlpool"));
        products.add(new Product("Washing Machine", 28000, 6, "Samsung"));
        products.add(new Product("Air Conditioner", 42000, 5, "Panasonic"));
        products.add(new Product("Printer", 11000, 9, "Canon"));
        products.add(new Product("External SSD", 7000, 22, "Western Digital"));

    }
    public boolean addProduct(Product product) {
        boolean isThere = products.stream().anyMatch(product1 -> product1.getName().equalsIgnoreCase(product.getName()));
        if (isThere)
        {
            System.out.println("The Product Already Exists");
            return false;
        }
        if(product.getQuantity()<100)
        {
            throw  new GlobalExceptions.QuantityException("Error Occured The Quantity Should Be Grater Than 100");
        }
        products.add(product);
        return true;
    }
    public List<Product> sortByPrice()
    {
        return products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
    }


    public List<Product> sortByPriceRange(double first, double second) {
       return  products.stream().filter(product -> product.getPrice()>=first && product.getPrice()<=second).sorted(Comparator.comparingDouble(Product::getPrice).reversed()).toList();
    }

    public List<Product> sortByPriceAndDate() {
        return products.stream().sorted(Comparator.comparing(Product::getPrice)).sorted(Comparator.comparing(Product::getDate_of_manufacturing).reversed()).toList();
    }

    public List<Product> findByProductName(String name) {
        return products.stream().filter(product -> product.getName().equalsIgnoreCase(name)).toList();
    }

    public List<Product> findByPrice(double price) {
        return products.stream().filter(product -> product.getPrice()==price).toList();
    }

    public Product findByNameCompanyPrice(String name, double price, String company_name) {

       return  products.stream().filter(product -> product.getName().equalsIgnoreCase(name) && product.getPrice()==price && product.getCompany_name().equalsIgnoreCase(company_name)).findFirst().orElse(null);
    }

    public List<Product> findTopK(int n) {
        return products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(n).toList();
    }

    public List<Product> findLeastK(int n) {
        return products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).limit(n).toList();
    }
}
