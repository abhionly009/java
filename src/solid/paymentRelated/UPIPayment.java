package solid.paymentRelated;

public class UPIPayment implements Payment{


    private final String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }


    @Override
    public boolean pay(double amount) {

        if(!upiId.isEmpty()){
            System.out.println("Payment of this purchase has been done via upi for " + amount);
            return true;
        }

        return false;
    }
}
