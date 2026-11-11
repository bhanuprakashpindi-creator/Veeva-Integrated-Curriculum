import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ProductService productService=new ProductService();
        while (true)
        {
            System.out.println("Enter 1.addProduct \n 2.Sort By Price \n 3. Sort By Price Range \n 4.Sort By Price And Date \n 5.Find By Product Name \n 6. Find By Product Date \n 7.Find By Price \n .8 Find By Name,Company and Price \n 9.Find Top K Products \n 10.Find Least K Products");
            int choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.sortByPrice();
                    break;
                case 3:
                    productService.sortByPriceRange();
                    break;
                case 4:
                    productService.sortByPriceAndDate();
                    break;
                case 5:
                    productService.findByProductName();
                    break;
                case 6:
                    // productService.findByProductDate();
                    break;
                case 7:
                    productService.findByPrice();
                    break;
                case 8:
                    productService.findByNameCompanyPrice();
                    break;
                case 9:
                    productService.findTopK();
                    break;
                case 10:
                    productService.findLeastK();
                    break;
                default:
                    System.out.println("Enter a Valid Option!");
            }
        }
    }
}