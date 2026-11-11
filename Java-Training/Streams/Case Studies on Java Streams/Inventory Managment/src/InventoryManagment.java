import java.sql.SQLOutput;
import java.util.Scanner;

public class InventoryManagment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        inventory.fetchMockData();
        while(true)
        {
            System.out.println("\n 1.Add Product To The Inventory \n 2.Remove Product From The Inventory \n 3.Check The Quantity OF The Product \n 4. Update The Quantity Of the Product \n 5.View All The Products \n 6. EXIT");
            System.out.println("Enter The Required Option : ");
            int choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    inventory.addProduct();
                    break;
                case 2:
                    inventory.removeProduct();
                    break;
                case 3:
                    inventory.checkQuantity();
                    break;
                case 4:
                    inventory.updateQuantity();
                    break;
                case 5:
                    inventory.viewAll();
                    break;
                case 6:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Enter The Valid Option!!!");
            }
        }
    }
}
