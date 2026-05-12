package factoryDesignPattern.PaymentSystem;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $ " + amount + " via PayPal Payment");
    }
}
