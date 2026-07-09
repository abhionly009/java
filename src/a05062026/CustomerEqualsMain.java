package a05062026;

public class CustomerEqualsMain {



    public static void main(String[] args) {

        Customer customer = new Customer(null,"90");
        Customer otherCustomer = new Customer(null,"90");

        System.out.println(customer.equals(otherCustomer));

    }
}
