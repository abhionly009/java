package factoryDesignPattern.PaymentSystem;

public class PaymentFactory {

    public static Payment getPayment(String paymentType){

        switch (paymentType.toLowerCase()){
            case "credit":return new CreditCardPayment();
            case "paypal": return new PayPalPayment();
            case "upi":return new UPIPayment();
            case "debit":return new DebitCardPayment();
            default: throw new IllegalArgumentException("Unknown payment type");
        }

    }

}
