import model.Company;
import model.Product;
import repository.CompanyRepository;
import repository.ProductRepository;

public class MockData {

    public static void loadData(
            CompanyRepository companyRepository,
            ProductRepository productRepository) {

        // ================= COMPANIES =================

        Company c1 = new Company(101, "Samsung India",
                "9876543210", "Noida, UP");

        Company c2 = new Company(102, "Apple India",
                "9876543211", "Mumbai, Maharashtra");

        Company c3 = new Company(103, "Lenovo India",
                "9876543212", "Bengaluru, Karnataka");

        Company c4 = new Company(104, "Dell Technologies",
                "9876543213", "Hyderabad, Telangana");

        Company c5 = new Company(105, "Sony India",
                "9876543214", "Chennai, Tamil Nadu");

        Company c6 = new Company(106, "Xiaomi India",
                "9876543215", "Gurugram, Haryana");

        companyRepository.addCompany(101, c1);
        companyRepository.addCompany(102, c2);
        companyRepository.addCompany(103, c3);
        companyRepository.addCompany(104, c4);
        companyRepository.addCompany(105, c5);
        companyRepository.addCompany(106, c6);


        // ================= PRODUCTS =================

        Product p1 = new Product("Galaxy S25",
                79999, "Smartphones", 101, 20);

        Product p2 = new Product("iPhone 17",
                82900, "Smartphones", 102, 15);

        Product p3 = new Product("Lenovo IdeaPad Slim 5",
                65990, "Laptops", 103, 25);

        Product p4 = new Product("Dell Inspiron 15",
                58990, "Laptops", 104, 18);

        Product p5 = new Product("Sony WH-1000XM5",
                24990, "Headphones", 105, 30);

        Product p6 = new Product("Redmi Note 15",
                18999, "Smartphones", 106, 40);

        Product p7 = new Product("Samsung 1TB SSD",
                8999, "Storage", 101, 35);

        Product p8 = new Product("Apple AirPods Pro",
                24900, "Accessories", 102, 28);

        productRepository.addProduct(p1);
        productRepository.addProduct(p2);
        productRepository.addProduct(p3);
        productRepository.addProduct(p4);
        productRepository.addProduct(p5);
        productRepository.addProduct(p6);
        productRepository.addProduct(p7);
        productRepository.addProduct(p8);

        System.out.println("Mock Data Loaded Successfully!");
    }
}