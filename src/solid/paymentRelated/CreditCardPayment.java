package solid.paymentRelated;

public class CreditCardPayment implements Payment{

    private final String cardNumber ;
    private final String expiryDate;
    private final String cvv;
    private final String cardHolderName;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }


    @Override
    public boolean pay(double amount) {
        if (validateCard(cardNumber,cvv,cardHolderName,expiryDate)){
            System.out.println("Payment is done with card ending "+cardNumber.substring(11,16) + " of rupees" + amount);
            return true;
        }


        return false;
    }

    private boolean validateCard(String cardNumber, String cvv, String cardHolderName, String expiryDate){

        return cardNumber.length() == 16 && cvv.length() == 3 && !cardHolderName.isEmpty() && !expiryDate.isEmpty();



    }
}
