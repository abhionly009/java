package a15062026;

import aaaaaaaaaaaaaaaaaapiStreamString.User;

public class ThreadLocalExample {

    public static void main(String[] args) {

        LoginWithUserContext userService =
                new LoginWithUserContext();

        OrderService orderService =
                new OrderService();

        userService.login();

        orderService.createOrder();

    }
}
