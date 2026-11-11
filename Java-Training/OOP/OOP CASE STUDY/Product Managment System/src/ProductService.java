import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    ProductRepository productRepository=new ProductRepository();
    ProductService()
    {
        productRepository.fetchMock();
    }
    public void addProduct()
    {
        System.out.println("Enter The Name Of The Product");
        String name=scanner.next();
        System.out.println("Enter The Price Of The Product");
        double price=scanner.nextDouble();
        System.out.println("Enter The Quantity of the product");
        int quantity=scanner.nextInt();
        System.out.println("Enter The Company Name");
        String companyName=scanner.next();
        Product product=new Product(name,price,quantity,companyName);
       boolean isAdded =  productRepository.addProduct(product);
       if (isAdded)
       {
           System.out.println("The Product Added Succesfully!!");
           return;
       }
    }
    public void sortByPrice()
    {
        List<Product> products=productRepository.sortByPrice();
        System.out.println("The Product Are Displayed Below!!!");
        products.stream().forEach(System.out::println);
    }
    public void sortByPriceRange()
    {
        System.out.println("Enter The Price range");
        double first=scanner.nextDouble();
        double second=scanner.nextDouble();
        List<Product> products=productRepository.sortByPriceRange(first,second);
        products.stream().forEach(System.out::println);
    }
    public void sortByPriceAndDate()
    {
        List<Product> products=productRepository.sortByPriceAndDate();
        products.stream().forEach(System.out::println);
    }
    public void findByProductName()
    {
        System.out.println("Enter The Product Name To Search for details");
        String name=scanner.next();
        List<Product> products=productRepository.findByProductName(name);
        products.stream().forEach(System.out::println);
    }
//    public void findByProductDate()
//    {
//        System.out.println("Enter The Product Date(YYYY-MM-DD) to Search For Details");
//        String date=scanner.nextLine();
//        try
//        {
//            LocalDate formatted= DateTimeFormatter(date)
//        }
//    }

    public void findByPrice()
    {
        System.out.println("Enter The Price Of The Product");
        double price=scanner.nextDouble();
        List<Product> products=productRepository.findByPrice(price);
        products.stream().forEach(System.out::println);
    }
    public void findByNameCompanyPrice()
    {
        System.out.println("Enter  Product Name");
        String name=scanner.next();
        System.out.println("Enter  The Price Of The Product ");
        double price=scanner.nextDouble();
        System.out.println("Enter The Company Name");
        String company_name=scanner.next();
       Product product = productRepository.findByNameCompanyPrice(name,price,company_name);
       if (product==null)
       {
           System.out.println("No Product Found!!");
           return;
       }
        System.out.println(product.toString());
    }
    public void findTopK()
    {
        System.out.println("Enter The No.Of Products You Want From Highest Price");
        int n=scanner.nextInt();
        List<Product> products = productRepository.findTopK(n);
        products.stream().forEach(System.out::println);
    }
    public  void findLeastK()
    {
        System.out.println("Enter The No.Of Products You Want From Least Price");
        int n=scanner.nextInt();
        List<Product> products = productRepository.findLeastK(n);
        products.stream().forEach(System.out::println);
    }

}
