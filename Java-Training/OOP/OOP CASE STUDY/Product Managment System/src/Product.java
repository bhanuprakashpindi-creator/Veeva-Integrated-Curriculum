import java.time.LocalDate;

public class Product {

   private int product_id;
   private String name;
   private double price;
   private LocalDate date_of_manufacturing;
   private int quantity;
   private String company_name;
   static int count=1;
   public Product(String name,double price,int quantity,String company_name)
   {
       this.name=name;
       this.product_id=count++;
       this.price=price;
       this.date_of_manufacturing= LocalDate.now();
       this.quantity=quantity;
       this.company_name=company_name;
   }
    public Product() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate_of_manufacturing() {
        return date_of_manufacturing;
    }

    public void setDate_of_manufacturing(LocalDate date_of_manufacturing) {
        this.date_of_manufacturing = date_of_manufacturing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date_of_manufacturing=" + date_of_manufacturing +
                ", quantity=" + quantity +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
