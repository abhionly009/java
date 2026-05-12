package factoryDesignPattern.PaymentSystem;

public class UPIPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing $ " + amount + " via UPI ");
    }
}
