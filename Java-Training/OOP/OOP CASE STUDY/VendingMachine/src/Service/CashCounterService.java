package Service;

import Exceptions.InvalidCurrencyException;
import Repository.CashCounterRepository;

import java.util.Scanner;

public class CashCounterService {
    private CashCounterRepository cashCounterRepository;
    public CashCounterService (CashCounterRepository cashCounterRepository)
    {
        this.cashCounterRepository=cashCounterRepository;
    }

    Scanner scanner = new Scanner(System.in);
    public void addCurency()
    {
        System.out.println("================Available Currency Types===================");
        System.out.println("1. 500\n2. 200\n3. 100\n4. 50\n6. 20\n7. 10\n8. 5\n9. 2\n10. 1");
        System.out.println("Enter The Currency Type:");
        int currency=scanner.nextInt();
        if (currency!=500 && currency!=200 && currency!=100 && currency!=50 && currency!=20 && currency!=10 && currency!=5 && currency!=2 && currency!=1)
        {
            throw new InvalidCurrencyException("Invalid Currency Option!!!");
        }
        System.out.println("Enter The Quanitity");
        long quantity=scanner.nextLong();
        if (quantity <=0)
            throw new InvalidQuantityException("Quantity Should Be Above 0");
        cashCounterRepository.addCurrency(currency,quantity);;
    }

}
