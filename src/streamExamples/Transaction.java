package streamExamples;


public class Transaction {

    private int id;
    private long amount;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    private int days;

    public Transaction(int id, long amount, int days) {
        this.id = id;
        this.amount = amount;
        this.days =days;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", days=" + days +
                '}';
    }
}
