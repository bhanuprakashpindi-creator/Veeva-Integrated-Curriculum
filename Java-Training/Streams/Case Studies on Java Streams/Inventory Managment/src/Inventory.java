import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
List<Product> products=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
public void addProduct()
{
    System.out.println("Enter The Name Of The Product");
    String name=scanner.next();
    System.out.println("Enter The Price Of The Product");
    double price=scanner.nextDouble();
    System.out.println("Enter The Quantity Of The Product");
    int quantity=scanner.nextInt();
    Product product=new Product(name,price,quantity);
    products.add(product);
    System.out.println("Product Added Successfully!!");
}
public void removeProduct()
{
    System.out.println("Enter The Name Of The Product To Remove From Inventory : ");
    String name=scanner.next();
    int size= products.size();
    products = products.stream().filter(product -> !product.getName().equalsIgnoreCase(name)).toList();
    if(size==products.size())
    {
        System.out.println("Product Not Found!!!");
        return;
    }
    System.out.println("Product Removed Successfully!!!");
}
public void checkQuantity()
{
    System.out.println("Enter The Name Of The Product To Check The Quantity OF That Product");
    String name=scanner.next();
    Product product = products.stream().filter(product1 -> product1.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    if(product==null)
    {
        System.out.println("No Product Found With That Name !!");
        return;
    }
    System.out.println("The Product "+product.getName()+" Has "+product.getQuantity()+" Stock Left In The Invetory.");
}

public void updateQuantity()
{
    System.out.println("Enter The Name Of The Product To Update The Quantity OF That Product");
    String name=scanner.next();
    System.out.println("Enter Thr Quantity : ");
    int quantity=scanner.nextInt();
   boolean isFound=false;
    for (Product product1 : products) {
        if (product1.getName().equalsIgnoreCase(name)) {
            product1.setQuantity(quantity);
            isFound = true;
            break;
        }
    }
    if(!isFound)
    {
        System.out.println("No Product Found With That Name !!");
        return;
    }
    System.out.println("Product Quantity Updated To :" + quantity);
}

    public void viewAll() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void fetchMockData()
    {
        Product product1=new Product("Laptop",199999,15);
        Product product2=new Product("Phone",50000,25);
        Product product3=new Product("AC",45000,35);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
}
