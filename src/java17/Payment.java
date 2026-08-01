package java17;

public sealed class Payment permits UPIPayment,NetBankingPayment,CardPayment,OtherPayment {

    void pay(double amount) {

    }

}
