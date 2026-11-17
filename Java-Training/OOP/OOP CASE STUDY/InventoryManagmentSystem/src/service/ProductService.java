package service;

import model.Company;
import model.Product;
import repository.ProductRepository;

import java.util.Scanner;

public class ProductService {

    private ProductRepository productRepository;
    Scanner scanner = new Scanner(System.in);
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
    }
    public void addProduct()
    {
        System.out.println("Enter The Name Of The Product");
        String name=scanner.nextLine();
        System.out.println("Enter The Unit Price");
        double unitPrice=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter The Category");
        String category=scanner.nextLine();
        System.out.println("Enter The Related Company Id");
        int id=scanner.nextInt();
        System.out.println("Enter the Quantity");
        long quantity=scanner.nextLong();
        Product product=new Product(name,unitPrice,category,id,quantity);
        productRepository.addProduct(product);
    }
    public void updateProduct()
    {
        System.out.println("Enter The Name Of The Product");
        String name=scanner.nextLine();
        System.out.println("Enter The Unit Price");
        double unitPrice=scanner.nextDouble();
        System.out.println("Enter The Category");
        String category=scanner.nextLine();
        System.out.println("Enter The Related Company Id");
        int id=scanner.nextInt();
        System.out.println("Enter the Quantity");
        long quantity=scanner.nextLong();
        Product product=new Product(name,unitPrice,category,id,quantity);
        productRepository.updateProduct(product);
    }
    public void priceLookUp()
    {
        System.out.println("Enter The Product Name");
        String name=scanner.nextLine();
        productRepository.priceLookUp(name);
    }
}