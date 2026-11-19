package Service;

import Exceptions.InvalidProductDetailsException;
import Exceptions.ProductCodeAlreadyExistsException;
import Exceptions.InvalidProductCodeException;
import Model.Product;
import Repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void addProduct(String code, Product product) {
        if (code == null || code.trim().isEmpty()) {
            throw new InvalidProductCodeException("Product Code Should Not Be Empty");
        }
        if (product == null) {
            throw new InvalidProductDetailsException("Ivalid Product Details");
        }
        if(productRepository.contains(code))
        {
            throw new ProductCodeAlreadyExistsException("Product Code Already Exists Please Try Unique Once");
        }
        productRepository.addProduct(code, product);
        System.out.println("Product Added Successfully");
    }
}