package java17;

public final class UPIPayment extends Payment{

    @Override
    void pay(double amount) {

        System.out.println("Paying amount  "+  amount + " using UPI Payment");

    }
}
