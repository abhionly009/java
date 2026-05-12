public class Transactional {

        String userId;
        double amount;
        String type ;//CREDIT or DEBIT

    public String getUserId() {
        return userId;
    }

    public Transactional(String userId, double amount, String type) {
        this.userId = userId;
        this.amount = amount;
        this.type = type;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transactional{" +
                "userId='" + userId + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

}
