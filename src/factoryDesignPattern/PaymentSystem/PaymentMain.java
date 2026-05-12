package factoryDesignPattern.PaymentSystem;

public class PaymentMain {
    public static void main(String[] args) {

        System.out.println("You are about to checkout.....");

        OrderService orderService = new OrderService();

        orderService.checkout("debit", 5403);

    }
}
