package repository;

import model.Company;
import model.Product;

import java.util.HashMap;

public class ProductRepository {
    HashMap<String, Product> productList=new HashMap<>();
    CompanyRepository companyRepository;
    public ProductRepository(CompanyRepository companyRepository)
    {
        this.companyRepository=companyRepository;
    }
    public void addProduct(Product product) {
        if(productList.containsKey(product.getProductName()))
        {
            System.out.println("Error : Product Already Exists");
            return;
        }
        else if(!companyRepository.companyList.containsKey(product.getCompanyId()))
        {
            System.out.println("Error : Company Not Exists");
            return;
        }
        productList.put(product.getProductName(),product);
        System.out.println("Product Added Successfully");
    }
    public void updateProduct(Product product)
    {
        if(!productList.containsKey(product.getProductName()))
        {
            System.out.println("Error : No Product Found with name "+product.getProductName());
            return;
        }
        else if(!companyRepository.companyList.containsKey(product.getCompanyId()))
        {
            System.out.println("Error : Company Not Exists");
            return;
        }
        productList.put(product.getProductName(),product);
        System.out.println("Product Updated Succesfully..");
    }

    public void priceLookUp(String name) {
        if(!productList.containsKey(name))
        {
            System.out.println("No Product Found With name "+name);
            return;
        }
        Product product=productList.get(name);
        System.out.println("Product Details :");
        System.out.println(product);
       Company company=  companyRepository.companyList.get(product.getCompanyId());
        System.out.println("Company Details :");
        System.out.println(company);
    }
}
