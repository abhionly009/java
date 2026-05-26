package copyObject;

public class Product {

    private String name;
    private String desc;
    private Category category;
    private long id;
    private double price;

    public Product() {
    }

    public Product(Product product){
        this.price = product.getPrice();
        this.id = product.getId();
        this.name = product.getName();
        this.desc = product.getDesc();
        this.category = product.getCategory();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", category='" + category .getType()+ '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public Product(String name, String desc, Category category, long id, double price) {
        this.name = name;
        this.desc = desc;
        this.category = category;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
