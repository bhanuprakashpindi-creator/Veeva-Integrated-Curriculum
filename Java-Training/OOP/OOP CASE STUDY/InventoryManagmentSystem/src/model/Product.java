package model;

public class Product {
    private String productName;
    private double unitPrice;
    private String category;
    private int companyId;
    private long quantity;

    public Product(String productName, double unitPrice, String category, int companyId,long quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.category = category;
        this.companyId = companyId;
        this.quantity=quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", category='" + category + '\'' +
                ", companyId=" + companyId +
                ", quantity=" + quantity +
                '}';
    }
}
