package factoryDesignPattern.PaymentSystem;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $ " + amount + " via Credit Card");
    }
}
