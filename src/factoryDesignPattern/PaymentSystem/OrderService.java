package factoryDesignPattern.PaymentSystem;

public class OrderService {

    public void checkout (String paymentType, double amount){
        Payment payment = PaymentFactory.getPayment(paymentType);
        payment.processPayment(amount);
    }


}
