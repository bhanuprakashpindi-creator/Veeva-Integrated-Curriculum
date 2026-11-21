package OrdersCaseStudy;

public class Order {
    private int orderId;
    private int customerId;
    private String category;
    private double amountSpent;

    public Order(int orderId, int customerId, String category, double amountSpent) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.category = category;
        this.amountSpent = amountSpent;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", category='" + category + '\'' +
                ", amountSpent=" + amountSpent +
                '}';
    }
}
