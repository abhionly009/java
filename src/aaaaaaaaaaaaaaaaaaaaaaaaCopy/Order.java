package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items;

    Order() {

        // Order owns OrderItems
        items = new ArrayList<>();

        items.add(new OrderItem("Laptop"));
        items.add(new OrderItem("Mouse"));
    }

    void showOrder() {

        System.out.println("Order Items:");

        for (OrderItem item : items) {
            item.displayItem();
        }
    }
}
