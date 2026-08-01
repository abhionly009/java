package java17;

public class PaymentMainDemo {


    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay(391.12);
    }

}
