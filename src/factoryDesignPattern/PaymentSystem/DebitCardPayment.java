package factoryDesignPattern.PaymentSystem;

public class DebitCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $ "+ amount +" via Debit Card");

    }
}
