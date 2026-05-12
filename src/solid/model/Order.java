package solid.model;

public class Order {

    private String name;
    private long quantity;
    private double amount;

    public Order(String name, long quantity, double amount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Order() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", amount=" + amount +
                '}';
    }
}
