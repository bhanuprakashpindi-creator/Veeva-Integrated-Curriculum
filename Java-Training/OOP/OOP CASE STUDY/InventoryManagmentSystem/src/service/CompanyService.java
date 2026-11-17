package service;

import model.Company;
import model.Product;
import repository.CompanyRepository;

import java.security.PublicKey;
import java.util.Scanner;

public class CompanyService {
    CompanyRepository companyRepository;
    Scanner scanner = new Scanner(System.in);

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public void addCompany()
    {
        System.out.println("Enter The Name Of The Company");
        String name=scanner.nextLine();
        System.out.println("Enter The PhoneNumber");
        String phoneNumber=scanner.nextLine();
        System.out.println("Enter The Address");
        String location=scanner.nextLine();
        Company company=new Company(name,phoneNumber,location);
        boolean added = companyRepository.addCompany(company.getCompanyId(),company);
        if (added)
        {
            System.out.println("Company Added Succesfully!!!");
        }
    }
    public  void updateCompany()
    {
        System.out.println("Enter The Company Id");
        int id=scanner.nextInt();
        System.out.println("Enter The Name Of The Company");
        String name=scanner.nextLine();
        System.out.println("Enter The PhoneNumber");
        String phoneNumber=scanner.nextLine();
        System.out.println("Enter The Address");
        String location=scanner.nextLine();
        Company company=new Company(id,name,phoneNumber,location);
        companyRepository.updateCompany(id,company);
    }


}
