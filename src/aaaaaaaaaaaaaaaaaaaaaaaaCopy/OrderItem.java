package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

public class OrderItem {

    private String productName;

    OrderItem(String productName) {
        this.productName = productName;
    }

    void displayItem() {
        System.out.println("Product: " + productName);
    }
}
