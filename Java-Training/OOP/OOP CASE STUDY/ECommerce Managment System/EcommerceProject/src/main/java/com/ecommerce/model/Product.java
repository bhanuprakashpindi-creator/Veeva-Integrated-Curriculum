package com.ecommerce.model;

public class Product {

    private int productId;
    private String productName;
    private String company;
    private double price;
    private String description;
    private int stockQuantity;

    public Product() {
    }

    public Product(String productName, String company, double price,
                   String description, int stockQuantity) {

        this.productName = productName;
        this.company = company;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public Product(int productId, String productName, String company,
                   double price, String description, int stockQuantity) {

        this.productId = productId;
        this.productName = productName;
        this.company = company;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Product {" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}