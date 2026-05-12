package streamLogical;

public class Product {

    private String name;
    private boolean inStack;

    private long price;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isInStack() {
        return inStack;
    }

    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getInStack() {
        return inStack;
    }

    public void setInStack(boolean inStack) {
        this.inStack = inStack;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product(String name, boolean inStack, long price,String category) {
        this.name = name;
        this.inStack = inStack;
        this.price = price;
        this.category =category;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", inStack='" + inStack + '\'' +
                ", price=" + price +
                ", category=" + category +

                '}';
    }


}
