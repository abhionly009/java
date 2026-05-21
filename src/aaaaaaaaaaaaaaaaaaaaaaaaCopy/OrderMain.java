package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

public class OrderMain {

    public static void main(String[] args) {

        Order order = new Order();

        order.showOrder();

        // Delete parent object
        order = null;

        System.out.println("Order deleted");

    }
}
