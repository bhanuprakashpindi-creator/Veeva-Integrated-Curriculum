package service;

import model.Company;
import model.Product;
import repository.AllTransactionsRepository;
import repository.CompanyRepository;

import java.util.HashMap;

public class AllTransactionsService {
    private AllTransactionsRepository allTransactionsRepository;
    private  CompanyRepository companyRepository;
    public AllTransactionsService(AllTransactionsRepository allTransactionsRepository, CompanyRepository companyRepository)
    {
        this.allTransactionsRepository=allTransactionsRepository;
        this.companyRepository=companyRepository;
    }
    public void addTransaction(HashMap<Product,Long> cartItems)
    {
        allTransactionsRepository.addTransaction(cartItems);
    }
    public void display()
    {
        HashMap<Integer,HashMap<Product,Long>> trxs = allTransactionsRepository.dispaly();
        System.out.println("All Users Transactions :");
        for (Integer integer : trxs.keySet())
        {
            HashMap<Product,Long> cartItem=  trxs.get(integer);
            System.out.println("Transaction ID: "+integer);
            for (Product product:cartItem.keySet())
            {
                System.out.println("Product Details");
                System.out.println("Product Name: "+product.getProductName()+"\nUnit Price: "+product.getUnitPrice()
                +"\nCategory: "+product.getCategory()+"Total Quantity: "+cartItem.get(product));
                System.out.println("Company Details Of The Product:");
                Company company= companyRepository.companyList.get(product.getCompanyId());
                System.out.println("Company ID: "+company.getCompanyId()+
                        "\nCompany Name: "+company.getCompanyName()+
                        "\nCompany Contact Number: "+company.getPhoneNumber()+
                        "\n Company Location :"+company.getLocation());
            }
        }
    }
}
