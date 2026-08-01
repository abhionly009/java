package java17;

public sealed class CardPayment extends Payment permits DebitCard, CreditCard{
}
