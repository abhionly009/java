package solid;

import solid.model.Order;
import solid.model.OrderDTO;
import solid.model.User;
import solid.notificationRelated.EmailNotification;
import solid.notificationRelated.Notification;
import solid.paymentRelated.Payment;
import solid.paymentRelated.UPIPayment;

public class OrderMain {

    public static void main(String[] args) {


        Order order = new Order();
        order.setAmount(1250);
        order.setName("Hoodie");
        order.setQuantity(1);

        User user = new User();
        user.setName("abhinandan");
        user.setEmail("abhionly009@gmail.com");
        user.setMobile("9005805189");

        Notification notification = new EmailNotification();
        Payment payment = new UPIPayment("abhionly@ybl");

        OrderService orderService = new OrderService(notification, payment);

        OrderDTO orderResponse =  orderService.placeOrder(order,user);

        System.out.println(orderResponse);


    }
}
