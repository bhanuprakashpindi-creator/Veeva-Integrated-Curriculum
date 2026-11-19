package Model;

public class Product {
    private  String code;
    private String productName;
    private double price;
    private long quanitity;

    public Product(String code, String productName, double price, long quanitity) {
        this.code = code;
        this.productName = productName;
        this.price = price;
        this.quanitity = quanitity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(long quanitity) {
        this.quanitity = quanitity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quanitity=" + quanitity +
                '}';
    }
}
