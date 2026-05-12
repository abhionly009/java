package solid.model;

public class OrderDTO {

    private String message;

    private String name;

    private long quantity;

    public OrderDTO(String message, String name, long quantity) {

        this.message = message;
        this.name = name;
        this.quantity = quantity;
    }

    public OrderDTO() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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


    @Override
    public String toString() {
        return "OrderDTO{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

