package a15062026;

public class OrderService {

    public void createOrder() {

        System.out.println(
                "Order created by "
                        + UserContext.currentUser
        );
    }
}
